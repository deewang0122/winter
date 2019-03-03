package com.example.winter.service.user;

import com.example.winter.dao.jpa.MenuDao;
import com.example.winter.dao.mybatis.MenuMapper;
import com.example.winter.entity.user.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MenuService {

    @Autowired
    private MenuDao menuDao;

    @Resource
    private MenuMapper menuMappr;

    public List<Menu> findAll(Long userId) {
        List<Long> menuIds = new ArrayList<>();

        List<Menu> userMenus = menuMappr.findMenuByUser(userId);

        List<Menu> roleMenus = menuMappr.findMenuByRole(userId);

        userMenus.forEach(menu -> {
            menuIds.add(menu.getId());
        });

        roleMenus.forEach(menu -> {
            menuIds.add(menu.getId());
        });

        List<Menu> allMenus = menuDao.findAllByIdInOrderByMenuIndexAsc(menuIds);

        return allMenus;
    }

}
