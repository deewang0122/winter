package com.example.winter.controller;

import com.example.winter.common.Result;
import com.example.winter.dto.LoginDto;
import com.example.winter.service.user.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登陆Controller
 */
@RestController
@RequestMapping
public class LoginController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "login")
    public Result login(@Validated LoginDto loginDto) {
        loginService.login(loginDto);
        return null;
    }

    @RequestMapping(value = "register")
    public Result register() {
        return null;
    }

    @RequestMapping(value = "logout")
    public Result logout() {
        return null;
    }
}
