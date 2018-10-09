package com.time.service;

import com.time.entity.USER;

import java.util.List;


public interface UserService {

    List<USER> showUser();
    public void add(USER user);
    USER getByname(String name);
}
