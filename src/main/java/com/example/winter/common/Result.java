package com.example.winter.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    public enum ResultFlag {
        SUCCESS("success", "成功"), FAIL("fail", "失败");

        String key;

        String value;

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setValue(String value) {
            this.value = value;
        }

        ResultFlag(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private String flag;

    private String message;

    private T data;

    public Result(String flag, String message) {
        this.flag = flag;
        this.message = message;
    }
}
