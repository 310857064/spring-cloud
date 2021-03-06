package com.tianwen.user.controller;

import com.tianwen.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * wangjq
 * 2020年04月04日  12:24
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${user-server-list}")
    private List<String> userServerList;

    @GetMapping(value = "/get")
    private User get(@RequestParam int id) {
        String server = userServerList.get(0);
        String url = "http://" + server + "/user/get?id=" + id;
        return restTemplate.getForObject(url, User.class);
    }

}
