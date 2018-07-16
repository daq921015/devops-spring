package top.smartpos.devops;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Configuration
@EnableSwagger2
public class BaoLiSwagger {
    @Bean
    public Docket createRestApi_baoli() {
        //保利公共参数
        Parameter service = new ParameterBuilder().name("service").description("要访问的接口名称").modelRef(new ModelRef("string")).parameterType("query").required(true).build();
        Parameter appkey = new ParameterBuilder().name("appkey").description("应用号。由汉朔提供。").modelRef(new ModelRef("string")).parameterType("query").required(true).build();
        Parameter merchant_id = new ParameterBuilder().name("merchant_id").description("商户ID:商家/平台渠道").modelRef(new ModelRef("int")).parameterType("query").required(true).build();
        Parameter _input_charset = new ParameterBuilder().name("_input_charset").defaultValue("utf-8").description("参数编码字符集,暂仅支持utf-8。").modelRef(new ModelRef("string")).parameterType("query").required(true).build();
        Parameter sing_type = new ParameterBuilder().name("sing_type").defaultValue("MD5").description("签名方式,暂仅支持MD5。").modelRef(new ModelRef("string")).parameterType("query").required(true).build();
        Parameter sign = new ParameterBuilder().name("sign").description("签名").modelRef(new ModelRef("string")).parameterType("query").required(true).build();
        Parameter cw_ca_request = new ParameterBuilder().name("cw_ca_request").description("签名类型(1:证书签名2:其他密钥签名.如果为空,默认为2)").modelRef(new ModelRef("string")).parameterType("query").required(false).build();
        //公共参数列表
        List<Parameter> aParameters = new ArrayList<Parameter>() {{
            add(service);
            add(appkey);
            add(merchant_id);
            add(_input_charset);
            add(sing_type);
            add(sign);
            add(cw_ca_request);
        }};
        //公共响应状态
        ArrayList<ResponseMessage> responseMessages = new ArrayList<ResponseMessage>() {{
            add(new ResponseMessageBuilder().code(200).message("成功").build());
            add(new ResponseMessageBuilder().code(404).message("请求资源不存在").responseModel(new ModelRef("Result")).build());
        }};
        //请求协议
        Set<String> protocolsSet = new LinkedHashSet<String>() {{
            add("http");
        }};
        return new Docket(DocumentationType.SWAGGER_2).groupName("保利会员系统").apiInfo(apiInfo_baoli())
                .globalOperationParameters(aParameters)
                .globalResponseMessage(RequestMethod.GET, responseMessages)
                .globalResponseMessage(RequestMethod.POST, responseMessages)
                .protocols(protocolsSet)
                .pathMapping("/").select()
                .apis(RequestHandlerSelectors.basePackage("top.smartpos.devops.controllers.baoli"))//添加选择条件
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo_baoli() {
        Contact contact = new Contact("刘邦龙", "https://www.baidu.com", "liubanglong@smartpos.top");
        return new ApiInfoBuilder().title("保利会员系统").contact(contact).version("1.0")
                .description("保利会员系统接口说明及调试").termsOfServiceUrl("服务URL").build();
    }
}