package com.example.winter.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FuncEnum {
    MENU("10", "菜单"),
    COMP("20", "组件/按钮");

    String key;

    String value;
}
