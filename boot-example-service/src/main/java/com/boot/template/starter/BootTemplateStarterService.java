package com.boot.template.starter;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.boot.template.starter.service")
@PropertySource("classpath:/dubbo/dubbo.properties")
public class BootTemplateStarterService {

    public static void main(String[] args) {
        SpringApplication.run(BootTemplateStarterService.class, args);
    }

}
