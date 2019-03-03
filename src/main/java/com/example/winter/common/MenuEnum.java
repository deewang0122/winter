package com.example.winter.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MenuEnum {
    ENCLICK("10", "功能菜单"),
    UNCLICK("20", "目录菜单");

    String key;

    String value;
}
