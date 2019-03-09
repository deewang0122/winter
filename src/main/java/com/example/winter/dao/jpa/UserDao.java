package com.example.winter.dao.jpa;

import com.example.winter.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

    User findByLoginCode(String loginCode);

    User findByLoginCodeAndStatus(String loginCode, String status);

    User findByLoginCodeAndPasswordAndStatus(String loginCode, String password, String status);
}
