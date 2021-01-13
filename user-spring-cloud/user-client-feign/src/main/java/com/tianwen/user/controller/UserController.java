package com.tianwen.user.controller;

import com.tianwen.user.client.UserFeignClient;
import com.tianwen.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * wangjq
 * 2020年04月04日  12:24
 */
@RestController
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/get")
    private User get(@RequestParam int id) {
        return userFeignClient.get(id);
    }

}
