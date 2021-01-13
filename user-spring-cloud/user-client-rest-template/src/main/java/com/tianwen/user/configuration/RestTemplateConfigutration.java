package com.tianwen.user.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * wangjq
 * 2020年04月04日  22:13
 */
@Configuration
public class RestTemplateConfigutration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
