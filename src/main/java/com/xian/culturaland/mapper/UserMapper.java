package com.xian.culturaland.mapper;

import com.xian.culturaland.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAllUsers();
}
