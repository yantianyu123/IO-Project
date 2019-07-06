package com.yan.configuration;

import com.yan.interceptor.MyInterceptor;
import com.yan.servlet.Myservlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

/**
 * @author 闫天宇
 * @date 2019/6/23-17:33
 */
@Configuration
public class MyConfiguration implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("success");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
    }
    //servlet组件注册
    @Bean
    public ServletRegistrationBean<Myservlet> servletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new Myservlet());
        servletRegistrationBean.setUrlMappings(Arrays.asList("/hello","/hello1"));
        return servletRegistrationBean;
    }

    //启用自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //指定要拦截的路径
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/index");

    }
}
