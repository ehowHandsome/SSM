package com.ehow.web;

import com.ehow.entity.User;
import com.ehow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by eHow on 2019/1/31.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/all")
    public String list(Model model){
        List<User> list = userService.getAll();
        model.addAttribute("list",list.get(0).toString());
        model.addAttribute("name","hello");
        return "allUser";
    }
}
