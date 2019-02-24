package com.example.winter.service.user;

import com.example.winter.dao.jpa.UserDao;
import com.example.winter.dto.user.UserDto;
import com.example.winter.entity.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public User save(User user) {
        userDao.save(user);

        return user;
    }

    @Transactional
    public User update(User user) {
        userDao.saveAndFlush(user);

        return user;
    }

    @Transactional
    public void delete(User user) {
        userDao.delete(user);
    }

    public UserDto findById(Long id) {
        UserDto userDto = new UserDto();
        User user = userDao.findById(id).get();

        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }
}
