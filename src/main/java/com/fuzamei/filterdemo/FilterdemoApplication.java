package com.fuzamei.filterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.fuzamei.filterdemo.filter")
public class FilterdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterdemoApplication.class, args);
    }
}
