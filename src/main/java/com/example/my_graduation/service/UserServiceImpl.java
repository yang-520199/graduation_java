package com.example.my_graduation.service;

import com.example.my_graduation.mapper.UserMapper;
import com.example.my_graduation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUSer(User user) {
        userMapper.addUser(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findByName(String u_name) {
        return userMapper.findByName(u_name);
    }
}
