package com.frank.cloud.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class FirstController {
    @GetMapping("/f")
    public String first() {
        return "success";
    }
}
