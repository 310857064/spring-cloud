package com.tianwen.user.controller;


import com.tianwen.user.client.UserClient;
import com.tianwen.user.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * wangjq
 * 2020年03月29日  23:04
 */
@Slf4j
@RestController
public class UserController1 implements UserClient {

    @Override
    public User get(int id) {
        User user = new User("wang1", id);
        log.info("user {}", user);
        return user;
    }
}
