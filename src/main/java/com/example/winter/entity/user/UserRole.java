package com.example.winter.entity.user;

import com.example.winter.common.BaseVo;
import com.example.winter.common.StatusEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_role")
@NoArgsConstructor
public class UserRole extends BaseVo {

    @ManyToOne
    User user;

    @ManyToOne
    Role role;

    @Column(insertable = true, updatable = false)
    String status = StatusEnum.ENABLE.getKey();

    //是否是主角色，默认为否
    Boolean isMainRole;

    String mark;
}
