package com.time.dao;

import com.time.entity.USER;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {
    List<USER> getall();
    USER getById(int id);
    USER getByname(String name);
    void add(@Param("username")String  username,@Param("password") String password );
}
