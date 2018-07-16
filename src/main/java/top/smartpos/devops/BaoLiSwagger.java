package top.smartpos.devops;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class BaoLiSwagger {
    @Bean
    public Docket createRestApi_baoli() {
        //保利公共参数
//        ParameterBuilder aParameterBuilder = new ParameterBuilder();
//        Parameter service = aParameterBuilder.name("service").description("要访问的接口名称").modelRef(new ModelRef("string")).required(true).build();
//        Parameter appkey = aParameterBuilder.name("appkey").description("应用号。由汉朔提供。").modelRef(new ModelRef("string")).required(true).build();
//        Parameter merchant_id = aParameterBuilder.name("merchant_id").description("商户ID:商家/平台渠道").modelRef(new ModelRef("string")).required(true).build();
//        Parameter _input_charset = aParameterBuilder.name("_input_charset").defaultValue("utf-8").description("参数编码字符集,暂仅支持utf-8。").modelRef(new ModelRef("string")).required(true).build();
//        Parameter sing_type = aParameterBuilder.name("sing_type").defaultValue("MD5").description("签名方式,暂仅支持MD5。").modelRef(new ModelRef("string")).required(true).build();
//        Parameter sign = aParameterBuilder.name("sign").description("签名").modelRef(new ModelRef("string")).required(true).build();
//        Parameter cw_ca_request = aParameterBuilder.name("cw_ca_request").description("签名类型(1:证书签名2:其他密钥签名.如果为空,默认为2)").modelRef(new ModelRef("string")).required(false).build();
//        List<Parameter> aParameters = new ArrayList<>();
//        aParameters.add(service);
//        aParameters.add(appkey);
//        aParameters.add(merchant_id);
//        aParameters.add(_input_charset);
//        aParameters.add(sing_type);
//        aParameters.add(sign);
//        aParameters.add(cw_ca_request);

        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        Parameter token = aParameterBuilder
                .parameterType("header") //参数类型支持header, cookie, body, query etc
                .name("token") //参数名
                .defaultValue("token") //默认值
                .description("header中token字段测试")
                .modelRef(new ModelRef("string"))//指定参数值的类型
                .required(false).build(); //非必需，这里是全局配置，然而在登陆的时候是不用验证的
        List<Parameter> aParameters = new ArrayList<>();
        aParameters.add(token);

        return new Docket(DocumentationType.SWAGGER_2).groupName("保利会员系统").apiInfo(apiInfo_baoli())
                .globalOperationParameters(aParameters).pathMapping("/").select()
                .apis(RequestHandlerSelectors.basePackage("top.smartpos.devops.controllers.baoli"))//添加选择条件
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo_baoli() {
        Contact contact = new Contact("刘邦龙", "https://www.baidu.com", "liubanglong@smartpos.top");
        return new ApiInfoBuilder().title("保利会员系统").contact(contact).version("1.0")
                .description("保利会员系统接口说明及调试").termsOfServiceUrl("服务URL").build();
    }
}