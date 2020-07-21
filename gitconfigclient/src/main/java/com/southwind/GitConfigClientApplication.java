package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GitConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitConfigClientApplication.class,args);
    }
}
