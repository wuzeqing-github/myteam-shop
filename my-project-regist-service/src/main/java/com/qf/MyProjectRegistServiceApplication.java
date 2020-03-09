package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MyProjectRegistServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectRegistServiceApplication.class, args);
    }

}
