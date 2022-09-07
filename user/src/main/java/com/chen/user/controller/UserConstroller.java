package com.chen.user.controller;

import com.chen.user.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author fanchen
 * @Date 2022/9/7 10:29
 */
@RestController
public class UserConstroller {
    @Autowired
    private Userservice  userService;

    @GetMapping("test")
    public String test(){
        return userService.test();
    }
}
