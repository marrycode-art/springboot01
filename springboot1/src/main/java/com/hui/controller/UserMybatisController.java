package com.hui.controller;

import com.hui.entity.User;
import com.hui.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/mybatis")
public class UserMybatisController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    public List<User> getUserList(){
        return userMapper.getUserList();
    }
}
