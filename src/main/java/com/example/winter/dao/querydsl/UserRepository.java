package com.example.winter.dao.querydsl;

import com.example.winter.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
