package top.smartpos.devops;

import com.google.common.collect.Sets;
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
public class Swagger2 {
    //swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createRestApi_baoli() {
        //可以添加多个header或参数
        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder
                .parameterType("header") //参数类型支持header, cookie, body, query etc
                .name("token") //参数名
                .defaultValue("token") //默认值
                .description("header中token字段测试")
                .modelRef(new ModelRef("string"))//指定参数值的类型
                .required(false).build(); //非必需，这里是全局配置，然而在登陆的时候是不用验证的
        List<Parameter> aParameters = new ArrayList<>();
        aParameters.add(aParameterBuilder.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("保利会员系统")
                .apiInfo(apiInfo_baoli())//设置栏目名
//                .globalOperationParameters(aParameters)
//                .protocols(Sets.newHashSet("https", "http"))//设置协议
//                .produces(Sets.newHashSet("html/text"))
                .pathMapping("/")//设置api根路径
                .select()//初始化并返回一个API选择构造器
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("top.smartpos.devops.controllers.baoli"))//添加选择条件
                .paths(PathSelectors.any())//设置路径筛选
//                .paths(PathSelectors.ant("/baoli/**"))
                .build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo_baoli() {
        return new ApiInfoBuilder()
                //页面标题
                .title("保利会员系统")
                //创建人
                .contact(new Contact("刘邦龙", "https://www.baidu.com", "liubanglong@smartpos.top"))
                //版本号
                .version("1.0")
                //描述
                .description("保利会员系统接口说明及调试")
                .termsOfServiceUrl("服务URL")
                .build();
    }

    //swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createRestApi_haiding() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("海鼎POS系统")
                .apiInfo(apiInfo_haiding())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("top.smartpos.devops.controllers.haiding"))
                .paths(PathSelectors.any())
//                .paths(PathSelectors.ant("/haiding/**"))
                .build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo_haiding() {
        return new ApiInfoBuilder()
                //页面标题
                .title("海鼎POS系统")
                //创建人
                .contact(new Contact("刘邦龙", "", ""))
                //版本号
                .version("1.0")
                //描述
                .description("海鼎POS系统基础资料对接方案")
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