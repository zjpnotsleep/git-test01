package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> show(){
        List<User> users = userMapper.queryUserList();
        System.out.println("users");
        return users;
    }
}
