package com.cssl.config;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: ideaWorkSpance2
 * @Date: 2018/8/13 15:55
 * @Author: 刘帅哥
 * @Description:
 */
@Controller
public class ConfigController extends WebMvcConfigurerAdapter {

    @Bean
   public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
       WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
           @Override
           public void addViewControllers(ViewControllerRegistry registry) {
               registry.addViewController("/").setViewName("login");
               registry.addViewController("/index").setViewName("login");
           }
       };
       return adapter;
   }

}
