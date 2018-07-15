package top.smartpos.devops.properties;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 内部重定向访问路径
 */
@Configuration
public class SwaggerProperty implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/swagger").setViewName("forward:/doc.html");
        registry.addViewController("/").setViewName("forward:/doc.html");//项目首页
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
