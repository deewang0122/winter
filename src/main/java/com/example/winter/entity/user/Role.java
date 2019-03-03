package com.example.winter.entity.user;

import com.example.winter.common.BaseVo;
import com.example.winter.common.StatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@Table
@NoArgsConstructor
public class Role extends BaseVo {

    @NotBlank(message = "角色名称不能为空！")
    String name;

    @Column(insertable = true, updatable = false)
    String status = StatusEnum.ENABLE.getKey();

    String mark;
}
