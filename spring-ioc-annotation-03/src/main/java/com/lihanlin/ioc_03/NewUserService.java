package com.lihanlin.ioc_03;

import org.springframework.stereotype.Service;

@Service
public class NewUserService implements UserService{
    @Override
    public String show() {
        return "sb java";
    }
}
