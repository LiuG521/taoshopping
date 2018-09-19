package com.cssl.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: taoshopping01
 * @Date: 2018/9/11 10:14
 * @Author: misliu
 * @Description:
 */
public class myConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new userInterceptor()).addPathPatterns("/**").
//                excludePathPatterns("/","/static/**","/css/**","/js/**","/images/**");
    }
}
