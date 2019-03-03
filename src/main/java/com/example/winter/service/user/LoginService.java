package com.example.winter.service.user;

import com.example.winter.dto.LoginDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoginService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void login(LoginDto loginDto) {

    }
}
