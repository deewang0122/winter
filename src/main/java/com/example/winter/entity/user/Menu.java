package com.example.winter.entity.user;

import com.example.winter.common.BaseVo;
import com.example.winter.common.FuncEnum;
import com.example.winter.common.MenuEnum;
import com.example.winter.common.StatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table
@NoArgsConstructor
public class Menu extends BaseVo {

    @NotEmpty(message = "菜单名称不能为空！")
    String name;

    //默认url = 0
    String url = "0";

    @NotEmpty(message = "菜单编码不能为空！")
    String menuCode;

    @NotEmpty(message = "父id不能为空！")
    Long parMenuId;

    //默认排序为0
    Long menuIndex = 0L;

    //默认为有效状态
    String status = StatusEnum.ENABLE.getKey();

    //默认菜单类型
    String funcType = FuncEnum.MENU.getKey();

    //默认功能菜单，可点击
    String menuType = MenuEnum.ENCLICK.getKey();

    String icon;

    @Size(max = 255, message = "备注长度允许超过255个字符！")
    String mark;

}
