package com.example.my_graduation.service;

import com.example.my_graduation.model.User;

import java.util.List;

public interface IUserService {
    void addUSer(User user);
    List<User> findAll();
    User findByName(String u_name);
}
