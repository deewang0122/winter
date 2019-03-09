package com.example.winter.service.user;

import com.example.winter.common.Result;
import com.example.winter.common.StatusEnum;
import com.example.winter.dao.jpa.UserDao;
import com.example.winter.dto.LoginDto;
import com.example.winter.dto.UserDto;
import com.example.winter.entity.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class LoginService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public Result<UserDto> login(LoginDto loginDto) {
        Result<UserDto> result = new Result<>();

        User user = userDao.findByLoginCode(loginDto.getLoginCode());

        if (Objects.isNull(user)) {
            result.setMessage("工号不存在！");
            result.setFlag(Result.ResultFlag.FAIL.getKey());
        }

        user = userDao.findByLoginCodeAndStatus(loginDto.getLoginCode(), StatusEnum.ENABLE.getKey());

        if (Objects.isNull(user)) {
            result.setMessage("工号失效，请联系管理员！");
            result.setFlag(Result.ResultFlag.FAIL.getKey());
        }

        user = userDao.findByLoginCodeAndPasswordAndStatus(loginDto.getLoginCode(), loginDto.getPassword(), StatusEnum.ENABLE.getKey());

        if (Objects.isNull(user)) {
            result.setMessage("密码错误！");
            result.setFlag(Result.ResultFlag.FAIL.getKey());
        } else {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user, userDto);

            result.setFlag(Result.ResultFlag.SUCCESS.getKey());
            result.setMessage(Result.ResultFlag.SUCCESS.getValue());
            result.setData(userDto);
        }

        return result;
    }
}
