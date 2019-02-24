package com.example.winter.controller;

import com.example.winter.dto.user.UserDto;
import com.example.winter.entity.user.User;
import com.example.winter.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "save")
    public User save(@Validated User user) {
        log.info("新增用户信息！, user = {}", user);

        try {
            user = userService.save(user);
        } catch (Exception e) {
            log.error("新增用户信息失败！ user = {}, " + e.getMessage(), user);
        }

        log.info("新增用户信息成功！, user = {}", user);

        return user;
    }

    @PostMapping(value = "update/{id}")
    public User update(@Validated User user, @PathVariable("id") Long id) {
        log.info("更新用户信息！, user = {}", user);

        try {
            user.setId(id);
            user = userService.update(user);
        } catch (Exception e) {
            log.error("更新用户信息失败！ user = {}, " + e.getMessage(), user);
        }

        log.info("更新用户信息成功！, user = {}", user);

        return user;
    }

    @DeleteMapping(value = "delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        log.info("删除用户, id = {}", id);

        User user = new User();
        {
            user.setId(id);
        }
        try {
            userService.delete(user);
        } catch (Exception e) {
            log.error("删除用户信息失败！ id = {}, " + e.getMessage(), id);
        }

        log.info("删除用户成功, id = {}", id);
    }

    @GetMapping("findById/{id}")
    public UserDto findById(@PathVariable("id") Long id) {
        log.info("查询用户详情，id = {}", id);

        UserDto userDto = new UserDto();
        userDto = userService.findById(id);

        return userDto;
    }
}
