package com.example.winter.controller;

import com.example.winter.entity.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/demo")
    public String demo(@Validated User userVo) {
        log.info(userVo.getName());
        String name = "hello";

        return "hello world";
    }

    @GetMapping(value = "demo2")
    public String demo2() {
        redisTemplate.opsForValue().set("demo2", "this is a test redis!");
        log.info("test log ");
        String string = redisTemplate.opsForValue().get("demo2");
        return string;
    }
}
