package com.mh.work.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* TWorkComment 实体类
* Created by jobob on 2021-08-06.
*/
@Data
@TableName("t_work_comment")
public class WorkComment implements Serializable{


    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 内容
    */
    private String something;
    /**
    * 创建时间
    */
    private LocalDateTime createTime;
    /**
    * 最近更新时间
    */
    private LocalDateTime updateTime;
    /**
    * 删除标识 0_未删除 1_已删除
    */
    private Boolean isDeleted;
}