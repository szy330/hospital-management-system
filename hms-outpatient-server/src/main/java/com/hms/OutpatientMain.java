package com.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hms")
public class OutpatientMain {

    public static void main(String[] args) {
        SpringApplication.run(OutpatientMain.class, args);
    }
}
