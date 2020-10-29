package com.hms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.hms.mapper")
@EnableDiscoveryClient
//解决跨域问题
@EnableSwagger2
public class PharmacyMain {
    public static void main(String[] args) {
        SpringApplication.run(PharmacyMain.class,args);
    }
}
