package com.lihanlin.ioc_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Autowired
    @Qualifier(value = "userServiceImp")
    private UserService userService;


    public void show(){
        System.out.println(userService.show());
    }
}
