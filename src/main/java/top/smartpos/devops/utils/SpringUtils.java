package top.smartpos.devops.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;
import top.smartpos.devops.exceptions.ApiException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public class SpringUtils {
    /**
     * 获取类及其父类的所有属性
     *
     * @param modelClass
     * @return
     */
    public static List<Field> obtainAllFields(Class<?> modelClass) {
        ArrayList<Field> allFields = new ArrayList<>();
        while (modelClass != Object.class) {//循环遍历类及其所有父类中声明变量
            Field[] fields = modelClass.getDeclaredFields();
            for (Field field : fields) {
                int modifiers = field.getModifiers();
                //变量修饰符不能为 static final native
                if (!(Modifier.isStatic(modifiers) || Modifier.isFinal(modifiers) || Modifier.isNative(modifiers))) {
                    allFields.add(field);
                }
            }
            modelClass = modelClass.getSuperclass();
        }
        return allFields;
    }

    /**
     * 获取请求参数
     *
     * @return
     */
    public static Map<String, String> obtainRequestParameters() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        Map<String, String> requestParameters = new LinkedHashMap<>();
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            requestParameters.put(entry.getKey(), StringUtils.trimToEmpty(StringUtils.join(entry.getValue(), ",")));
        }
        return requestParameters;
    }

    /**
     * 根据Map内容获取对象实例
     *
     * @param modelClass
     * @param requestParameters
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T instantiateObject(Class<T> modelClass, Map<String, String> requestParameters) throws Exception {
        T obj = modelClass.newInstance();
        BeanUtils.populate(obj, requestParameters);
        return obj;
    }

    /**
     * 获取验证器
     *
     * @return
     */
    public static Validator obtainValidator() {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class).configure().buildValidatorFactory();
        return validatorFactory.getValidator();
    }

    public static <T> T validateAndThrow(Class<T> modelClass) throws Exception {
        Map<String, String> requestParameters = obtainRequestParameters();
        T obj = instantiateObject(modelClass, requestParameters);
        Validator validator = obtainValidator();
        List<Field> allFields = obtainAllFields(modelClass);
        for (Field field : allFields) {
//            Set<ConstraintViolation<Object>> constraintViolations = validator.validateProperty(obj, field.getName());
            String fieldName = field.getName();
            Iterator<ConstraintViolation<T>> iterator = validator.validateProperty(obj, fieldName).iterator();
            /*if (CollectionUtils.isNotEmpty(constraintViolations)) {
                throw new ApiException("参数验证失败");
            }*/
            if (iterator.hasNext()) {
                ConstraintViolation<T> constraintViolation = iterator.next();
                field.getAnnotation(constraintViolation.getConstraintDescriptor().getAnnotation().annotationType());
                String message = constraintViolation.getMessage();
                if (StringUtils.isBlank(message)) {
                    Locale locale = LocaleContextHolder.getLocale();
                    String annotationSimpleName = constraintViolation.getConstraintDescriptor().getAnnotation().annotationType().getSimpleName();
                    String defaultMessage = obtainParameterErrorMessage(fieldName);
                    message = obtainMessageSource().getMessage(modelClass.getName() + "." + fieldName + "." + annotationSimpleName, null, defaultMessage, locale);
                }
                throw new ApiException(message);
            }
        }
//        for (Field field : allFields) {
//            String fieldName = field.getName();
//             validator.validateProperty(obj, field.getName());
//            if (iterator.hasNext()) {
//                ConstraintViolation<Object> constraintViolation = iterator.next();
//                Locale locale = LocaleContextHolder.getLocale();
//                String annotationSimpleName = constraintViolation.getConstraintDescriptor().getAnnotation().annotationType().getSimpleName();
//                String defaultMessage = ApplicationHandler.obtainParameterErrorMessage(fieldName);
//                String message = obtainMessageSource().getMessage(modelClassName + "." + field.getName() + "." + annotationSimpleName, null, defaultMessage, locale);
//                throw new ApiException(message);
//            }
//        }
        return obj;
    }

    public static String obtainParameterErrorMessage(String parameterName) {
        String message = null;
        return message;
    }

    public static MessageSource obtainMessageSource() {
        return obtainApplicationContext().getBean(MessageSource.class);
    }

    public static ServletRequestAttributes getServletRequestAttributes() {
        return (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    }

    public static HttpServletRequest getHttpServletRequest() {
        return getServletRequestAttributes().getRequest();
    }

    private static ServletContext servletContext;
    private static ApplicationContext applicationContext;

    public static ServletContext obtainServletContext() {
        if (servletContext == null) {
            servletContext = getHttpServletRequest().getServletContext();
        }
        return servletContext;
    }

    public static ApplicationContext obtainApplicationContext() {
        if (applicationContext == null) {
            applicationContext = WebApplicationContextUtils.getWebApplicationContext(obtainServletContext());
        }
        return applicationContext;
    }
}
