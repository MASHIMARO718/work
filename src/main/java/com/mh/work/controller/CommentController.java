package com.mh.work.controller;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import com.mh.work.bean.Comment;
import com.mh.work.bean.Message;
import com.mh.work.entity.BaseUser;
import com.mh.work.entity.WorkComment;
import com.mh.work.mapper.CommentMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @ClassName controller
 * @Description TODO
 * @Author mhJiang
 * @Date 2021/8/5 14:48
 * @Version 1.0
 */
@RestController
@RequestMapping("/comment/")
public class CommentController {

    @Autowired
    public CommentMapper commentMapper;

    @PostMapping("save")
    public void saveComment(@RequestBody Comment comment){
        WorkComment workComment = new WorkComment();
        BeanUtils.copyProperties(comment,workComment);
        commentMapper.insert(workComment);
        try {
            WebSocketServer.sendInfo(JSONObject.toJSONString(Message.builder().type(1).msg(DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss ")+comment.getName()+"："+comment.getSomething()).build()),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
