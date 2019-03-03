package com.example.winter.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class LoginDto {

    @NotEmpty(message = "登陆账号不能为空！")
    @Size(min = 2, max = 10, message = "登陆账号不允许超过10个字符，且不能少于2个字符！")
    String loginCode;

    @Size(min = 6, max = 20, message = "密码不允许超过20个字符，且不能少于6个字符！")
    @NotEmpty(message = "密码不能为空！")
    @JsonIgnore
    String password;
}
