package com.example.winter.dto;

import com.example.winter.common.BaseVo;
import com.example.winter.entity.user.Role;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
public class UserDto extends BaseVo {

    Long id;

    String name;

    String loginCode;

    String telephone;

    String status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    Date createTime;

    Long createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    Date updateTime;

    Long updateBy;

    Set<Role> roles;

    List<MenuDto> menus;
}
