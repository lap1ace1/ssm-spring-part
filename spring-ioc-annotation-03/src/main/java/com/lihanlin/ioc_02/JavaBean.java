package com.lihanlin.ioc_02;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class JavaBean {
    @PostConstruct
    public void init(){
        System.out.println(".init");
    }
    public void clear(){
        System.out.println(".destroy");
    }
}
