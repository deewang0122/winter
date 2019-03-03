package com.example.winter.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    public enum ResultFlag {
        SUCCESS("成功"), FAIL("失败");

        String name;

        ResultFlag(String name) {
            this.name = name;
        }
    }

    private ResultFlag flag;

    private String message;

    private T data;

    public Result(ResultFlag flag, String message) {
        this.flag = flag;
        this.message = message;
    }
}
