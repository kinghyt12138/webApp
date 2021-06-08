package com.ssm.controller;
import com.ssm.bean.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author:king
 * FileName:UserController
 * Date:2021/6/7  16:09
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @DeleteMapping
    public String findAll(){
        return userService.findAll();
    }

    @ResponseBody
    @PostMapping("/login")
//    @RequestMapping(method=RequestMethod.GET)
    public String login(String name,String password){
        int count = userService.login(name,password);
        if(count>0){
            return "login success";
        }else{
            return "login fail";
        }
    }
}
