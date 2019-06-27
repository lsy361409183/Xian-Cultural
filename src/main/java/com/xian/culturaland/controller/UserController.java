package com.xian.culturaland.controller;

import com.xian.culturaland.entity.User;
import com.xian.culturaland.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public List<User> testUser(){
        return userService.selectAllUsers();
    }
}
