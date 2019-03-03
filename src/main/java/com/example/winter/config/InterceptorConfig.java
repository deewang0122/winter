package com.example.winter.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class InterceptorConfig {

    //@Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        //registrationBean.setFilter(new JwtF());
        registrationBean.addUrlPatterns("/secure/*");

        return registrationBean;

    }
}
