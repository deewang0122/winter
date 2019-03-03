package com.example.winter.dto;

import com.example.winter.common.BaseVo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MenuDto extends BaseVo {

    Long id;

    String name;

    String url = "0";

    String menuCode;

    Long parMenuId;

    Long menuIndex = 0L;

    String status;

    String funcType;

    String menuType;

    Boolean isMainRole;

    String mark;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    Date createTime;

    Long createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    Date updateTime;

    Long updateBy;

    List<MenuDto> childMenus;

}
