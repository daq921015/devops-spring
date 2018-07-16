package top.smartpos.devops;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class BaoLiSwagger {
    @Bean
    public Docket createRestApi_baoli() {
        //公共响应状态
        ArrayList<ResponseMessage> responseMessages = new ArrayList<ResponseMessage>() {{
            add(new ResponseMessageBuilder().code(200).message("成功").build());
            add(new ResponseMessageBuilder().code(404).message("请求资源不存在").responseModel(new ModelRef("Result")).build());
        }};
        //请求协议
        Set<String> protocolsSet = new LinkedHashSet<String>() {{
            add("http");
        }};
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("保利会员系统")
                .apiInfo(apiInfo_baoli())
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