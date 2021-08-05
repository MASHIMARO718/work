package com.mh.work.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName BaseUser
 * @Description TODO
 * @Author mhJiang
 * @Date 2021/8/5 15:29
 * @Version 1.0
 */
@Data
@TableName("t_base_user")
public class BaseUser {
    @TableId
    private Long id;

    private String userName;

    private String sex;

    private Integer isDeleted;

}
