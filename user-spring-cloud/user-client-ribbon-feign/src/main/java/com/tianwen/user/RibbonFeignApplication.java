package com.tianwen.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * wangjq
 * 2020年04月04日  11:56
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class RibbonFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonFeignApplication.class, args);
    }
}
