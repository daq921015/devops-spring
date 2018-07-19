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
public class HaiDingSwagger {
    @Bean
    public Docket createRestApi_haiding() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("海鼎POS系统")
                .apiInfo(apiInfo_haiding())
                .pathMapping("/").select()
                .apis(RequestHandlerSelectors.basePackage("top.smartpos.devops.controllers.haiding"))//添加选择条件
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo_haiding() {
        return new ApiInfoBuilder().title("海鼎POS系统").version("1.0")
                .description("销售数据对接步骤：1、调用资料校验接口，获取该收银机可以销售的商品和付款方式。2、调用销售数据接口回传销售")
                .build();
    }
}