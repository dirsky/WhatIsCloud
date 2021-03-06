package com.frank.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer_1 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_1.class, args);
    }
}
