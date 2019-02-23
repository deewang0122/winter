package com.example.winter.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum StatusEnum {
    enable("10", "有效"),
    disable("10", "无效"),
    pause("30", "暂停");

    String key;

    String value;
}
