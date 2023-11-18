package com.lihanlin.ioc_03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Override
    public String show() {
        return "fuck java";
    }
}
