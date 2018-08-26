package com.fengwenyi.springcloud.publiceurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PublicEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublicEurekaServiceApplication.class, args);
    }
}
