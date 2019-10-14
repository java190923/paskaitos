package com.vcs.lects.l16.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.vcs.lects.l16.spring.*"})
@PropertySource({"classpath:street.properties"})
public class CtxConfig {


    @Bean
    public String version() {
        return "v1.0";
    }


    @Bean
    public String helloWorld() {
        return "Sveiks pasauli";
    }


}
