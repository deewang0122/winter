package com.example.winter.entity.user;

import com.example.winter.common.BaseVo;
import com.example.winter.common.ObjEnum;
import com.example.winter.common.StatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "user_menu")
@NoArgsConstructor
public class UserMenu extends BaseVo {

    @NotEmpty(message = "授权对象不能为空！")
    String objType;

    @NotEmpty(message = "授权对象Id不能为空！")
    Long objId;

    @NotEmpty(message = "menu_id不能为空！")
    Long menu_id;

    @NotEmpty(message = "状态不能为空！")
    String status = StatusEnum.ENABLE.getKey();

    @Size(max = 255)
    String mark;
}