package com.example.winter;

import com.example.winter.common.StatusEnum;
import com.example.winter.dao.jpa.UserRepository;
import com.example.winter.dao.mybatis.UserMapper;
import com.example.winter.entity.user.User;
import com.example.winter.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WinterApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void saveUser() {
        User user = new User();
        {
            //user.setId(1L);
            user.setName("1");
            user.setLoginCode("code");
            user.setPassword("");
            user.setStatus(StatusEnum.enable.getKey());
            user.setTelephone("1372058327");
            //user.setCreateTime(Instant.now());
            user.setCreateBy(12L);
        }
        userRepository.save(user);
        List<User> list = userRepository.findAll();

        log.info(JsonUtil.objToStr(list));
    }

    @Test
    public void testMybatis() {
        log.info(userMapper.findOne(1L).getName());
        log.info( JsonUtil.objToStr(userMapper.findAll()) );
    }

}
