package com.frank.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider_1 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_1.class, args);
    }
}
