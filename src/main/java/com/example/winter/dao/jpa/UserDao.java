package com.example.winter.dao.jpa;

import com.example.winter.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
