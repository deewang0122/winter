package com.example.winter.dao.jpa;

import com.example.winter.entity.user.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuDao extends JpaRepository<Menu, Long> {
    List<Menu> findAllByIdInOrderByMenuIndexAsc(List<Long> ids);
}
