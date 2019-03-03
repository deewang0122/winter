package com.example.winter.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ObjEnum {
    USER("10", "关联用户"),
    ROLE("20", "关联角色");

    String key;

    String value;
}
