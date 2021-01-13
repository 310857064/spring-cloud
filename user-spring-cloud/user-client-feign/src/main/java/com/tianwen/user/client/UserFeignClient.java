package com.tianwen.user.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * wangjq
 * 2020年04月04日  12:00
 */
@FeignClient(value = "user-server", url = "127.0.0.1:8001")
public interface UserFeignClient extends UserClient {
}
