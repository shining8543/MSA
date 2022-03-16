package com.example.discoveryserivce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryserivceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryserivceApplication.class, args);
    }

}
