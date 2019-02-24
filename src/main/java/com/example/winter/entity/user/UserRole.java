package com.example.winter.entity.user;

import com.example.winter.common.BaseVo;
import com.example.winter.common.StatusEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "user_role")
@NoArgsConstructor
public class UserRole extends BaseVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    User user;

    @ManyToOne
    Role role;

    @Column(insertable = true, updatable = false)
    String status = StatusEnum.enable.getKey();

    String mark;
}
