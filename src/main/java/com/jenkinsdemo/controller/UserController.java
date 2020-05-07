package com.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController  {

    @RequestMapping("/findUserName")
    public String findUserName(){
        return  "我跟新了.......007";
    }

}
