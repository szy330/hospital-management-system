package com.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//注册服务中心要添加此注解
public class HmsEurekaMain {

    public static void main(String[] args) {
        SpringApplication.run(
                HmsEurekaMain.class, args
        );
    }
}
