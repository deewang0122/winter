package com.example.winter.entity.user;

import com.example.winter.common.BaseVo;
import com.example.winter.common.StatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user")
public class User extends BaseVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Long id;

    @Size(min = 2, max = 10, message = "姓名不允许超过10个字符，且不能少于2个字符！")
    @NotEmpty(message = "姓名不能为空！")
    String name;

    @Size(min = 6, max = 20, message = "密码不允许超过20个字符，且不能少于6个字符！")
    @NotEmpty(message = "密码不能为空！")
    String password;

    @NotEmpty(message = "登陆账号不能为空！")
    @Size(min = 2, max = 10, message = "登陆账号不允许超过10个字符，且不能少于2个字符！")
    String loginCode;

    @Size(min = 11, max = 11, message = "手机号码位数不正确！")
    @NotEmpty(message = "手机号码不能为空！")
    String telephone;

    @NotEmpty(message = "用户状态不能为空！")
    String status = StatusEnum.enable.getKey();
}
