package com.example.winter.dto.user;

import com.example.winter.common.BaseVo;
import com.example.winter.common.StatusEnum;
import com.example.winter.entity.user.Role;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Data
public class UserDto extends BaseVo {

    Long id;

    String name;

    String password;

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
}
