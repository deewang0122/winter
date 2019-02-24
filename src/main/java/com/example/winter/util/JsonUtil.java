package com.example.winter.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonUtil {
    /**
     * 对象转字符串
     * @param object
     * @return
     */
    public static String objToStr(Object object) {
        String str = "";

        try {
            ObjectMapper mapper = new ObjectMapper();
            str = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("Object 转字符串失败 ： [{}]" + e.getMessage());
        }

        return str;
    }
}
