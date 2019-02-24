package com.example.winter;

import com.example.winter.common.StatusEnum;
import com.example.winter.dao.jpa.UserDao;
import com.example.winter.dao.mybatis.UserMapper;
import com.example.winter.entity.user.User;
import com.example.winter.service.user.UserService;
import com.example.winter.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class WinterApplicationTests {

    @Autowired
    private UserDao userDao;

    @Resource
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

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
        userDao.save(user);
        List<User> list = userDao.findAll();

        log.info(JsonUtil.objToStr(list));
    }

    @Test
    public void testMybatis() {
        Optional<User> user = userDao.findById(2L);
        log.info(JsonUtil.objToStr(user.get()));
        //log.info( JsonUtil.objToStr(userMapper.findAll()) );
    }

    @Test
    public void test() {
        User user = new User();
        user.setId(1L);

        userService.delete(user);
    }

}
