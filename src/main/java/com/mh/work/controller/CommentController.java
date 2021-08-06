package com.mh.work.controller;

import com.mh.work.bean.Comment;
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
            WebSocketServer.sendInfo(comment.getSomething(),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
