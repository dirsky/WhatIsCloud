package com.frank.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
// 添加，看例子添加
@EnableEurekaClient

public class ZuulGateWay {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateWay.class, args);
    }
}
