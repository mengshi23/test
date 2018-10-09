package com.time.service.Impl;

import com.time.dao.UserMapper;
import com.time.entity.USER;
import com.time.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
   private UserMapper usermapper;

   public UserMapper getUsermapper(){
       return usermapper;
   }

   @Autowired
    public void setUsermapper(UserMapper usermapper){
       this.usermapper=usermapper;
   }

    @Override
    public List<USER> showUser(){
           return usermapper.getall();
    }

    @Override
    public void add(USER user){
       usermapper.add(user.getName(),user.getPwd());
    }

}
