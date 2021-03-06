package com.example.winter.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum StatusEnum {
    ENABLE("10", "有效"),
    DISABLE("10", "无效"),
    PAUSE("30", "暂停");

    String key;

    String value;
}
