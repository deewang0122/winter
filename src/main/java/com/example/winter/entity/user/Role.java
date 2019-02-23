package com.example.winter.entity.user;

import com.example.winter.common.BaseVo;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@Table
@NoArgsConstructor
public class Role extends BaseVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank(message = "角色名称不能为空！")
    String name;

    String mark;
}
