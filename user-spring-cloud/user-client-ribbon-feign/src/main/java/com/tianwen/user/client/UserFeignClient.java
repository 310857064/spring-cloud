package com.tianwen.user.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * wangjq
 * 2020年04月04日  12:00
 */
@FeignClient(value = "user-server-1"/*, url = "127.0.0.1:8081"*/)
public interface UserFeignClient extends UserClient {
}
