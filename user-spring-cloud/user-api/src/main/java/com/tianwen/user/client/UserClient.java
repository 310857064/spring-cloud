package com.tianwen.user.client;

import com.tianwen.user.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * wangjq
 * 2020年03月29日  22:41
 */
public interface UserClient {

    @GetMapping(value = "/user/get")
    User get(@RequestParam(value = "id") int id);
}
