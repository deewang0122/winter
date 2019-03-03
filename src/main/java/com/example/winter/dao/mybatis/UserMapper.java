package com.example.winter.dao.mybatis;

import com.example.winter.entity.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();

    @Select("select * from user where user_id = #{name}")
    User findOne(@Param("name") Long id);
}
