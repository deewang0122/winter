package com.example.winter.util;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Slf4j
public class DateUtil {
    /**
     * 从当前日期开始，获取某天/周/月/年后的日期(yyyy-MM-dd)
     *
     * @param flag
     * @return
     */
    public static LocalDate getCurrentDate(long plus, String flag) {
        LocalDate today = LocalDate.now();
        LocalDate plusDate = null;

        if ("day".equals(flag)) {
            plusDate = today.plus(plus, ChronoUnit.DAYS);
        }
        if ("week".equals(flag)) {
            plusDate = today.plus(plus, ChronoUnit.WEEKS);
        }
        if ("month".equals(flag)) {
            plusDate = today.plus(plus, ChronoUnit.MONTHS);
        }
        if ("year".equals(flag)) {
            plusDate = today.plus(plus, ChronoUnit.YEARS);
        }

        return plusDate;
    }

    /**
     * 比较两个日期大小
     *
     * @param localDate1
     * @param localDate2
     * @return
     */
    public static Boolean compareDate(LocalDate localDate1, LocalDate localDate2) {
        Boolean bool = localDate1.isBefore(localDate2);

        return bool;
    }
}
