package com.mh.work.bean;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @ClassName Message
 * @Description TODO
 * @Author mhJiang
 * @Date 2021/8/6 15:49
 * @Version 1.0
 */
@Data
@Builder
public class Message {
    /**
     * 0_初始消息 1_聊天消息
     */
    private Integer type;

    private String msg;

    private List<String> user;
}
