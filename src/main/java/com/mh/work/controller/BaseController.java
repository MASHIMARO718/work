package com.mh.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName controller
 * @Description TODO
 * @Author mhJiang
 * @Date 2021/8/5 14:48
 * @Version 1.0
 */
@Controller
@RequestMapping("/base")
public class BaseController {
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("/chat")
    public String toChat(){
        return "chat";
    }

    @RequestMapping("/qiXi")
    public String toQiXi(){
        return "qixi";
    }
}
