package com.mh.work.controller;

import com.mh.work.bean.Comment;
import com.mh.work.entity.BaseUser;
import com.mh.work.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName controller
 * @Description TODO
 * @Author mhJiang
 * @Date 2021/8/5 14:48
 * @Version 1.0
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    public UserMapper userMapper;

    @PostMapping("list")
    public List<BaseUser> getUsers(){
        return userMapper.selectList(null);
    }
}
