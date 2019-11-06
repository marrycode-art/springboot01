package com.hui.controller;

import com.hui.dao.UserDao;
import com.hui.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUserList(Model model) {
        List<User> userList = userDao.findAll();
        model.addAttribute("userList",userList);
        return "index";
    }
}