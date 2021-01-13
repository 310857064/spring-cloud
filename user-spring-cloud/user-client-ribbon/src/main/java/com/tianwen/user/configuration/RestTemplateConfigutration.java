package com.tianwen.user.configuration;

import com.netflix.client.DefaultLoadBalancerRetryHandler;
import com.netflix.client.RetryHandler;
import com.netflix.client.config.IClientConfig;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * wangjq
 * 2020年04月04日  22:13
 */
@Configuration
public class RestTemplateConfigutration {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public RetryHandler retryHandler() {
        return new DefaultLoadBalancerRetryHandler(0, 1, true);
    }
}
