package top.smartpos.devops;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
    //swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createRestApi_baoli() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("保利会员系统")
                .apiInfo(apiInfo_baoli())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("top.smartpos.devops.controllers"))
//                .paths(PathSelectors.any())
                .paths(PathSelectors.ant("/DSearch/**"))
                .build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo_baoli() {
        return new ApiInfoBuilder()
                //页面标题
                .title("保利会员系统")
                //创建人
                .contact(new Contact("刘邦龙", "", ""))
                //版本号
                .version("1.0")
                //描述
                .description("保利会员系统接口说明及调试")
                .build();
    }
//    @Bean
//    public Docket ProductApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .genericModelSubstitutes(DeferredResult.class)
//                .useDefaultResponseMessages(false)
//                .forCodeGeneration(false)
//                .pathMapping("/")
//                .select()
//                .build()
//                .apiInfo(productApiInfo());
//    }
//
//    private ApiInfo productApiInfo() {
//        ApiInfo apiInfo = new ApiInfo("XXX系统数据接口文档",
//                "文档描述。。。",
//                "1.0.0",
//                "API TERMS URL",
//                "联系人邮箱",
//                "license",
//                "license url");
//        return apiInfo;
//    }
}