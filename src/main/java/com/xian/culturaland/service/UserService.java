package com.xian.culturaland.service;


import com.xian.culturaland.entity.User;
import com.xian.culturaland.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectAllUsers(){
        return userMapper.selectAllUsers();
    }
}
