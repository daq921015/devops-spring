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
public class HaiDingSwagger {
    @Bean
    public Docket createRestApi_haiding() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("海鼎POS系统").apiInfo(apiInfo_haiding()).select()
                .apis(RequestHandlerSelectors.basePackage("top.smartpos.devops.controllers.haiding"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo_haiding() {
        Contact contact = new Contact("刘邦龙", "https://www.baidu.com", "liubanglong@smartpos.top");
        return new ApiInfoBuilder().title("海鼎POS系统").contact(contact).version("1.0")
                .description("海鼎POS系统基础资料对接方案").build();
    }
}