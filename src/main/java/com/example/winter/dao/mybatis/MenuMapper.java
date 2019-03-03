package com.example.winter.dao.mybatis;

import com.example.winter.entity.user.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuMapper {
    List<Menu> findMenuByUser(Long userId);

    List<Menu> findMenuByRole(Long userId);

    List<Menu> findAllMenu(Map<String, Object> map);

}
