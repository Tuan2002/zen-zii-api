package com.tuandev.zen_zii.service.impl;

import com.tuandev.zen_zii.mapper.UserMapper;
import com.tuandev.zen_zii.model.User;
import com.tuandev.zen_zii.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
