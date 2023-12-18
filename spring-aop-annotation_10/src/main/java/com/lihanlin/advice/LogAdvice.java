package com.lihanlin.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {
    //用注解配置 指定插入目标方法的位置
//    前置 @Before
//    后置 @AfterReturning
//    异常 @AfterThrowing
//    最后 @After
//    环绕 @Around

    public void start(){
        System.out.println("开始");
    }
    public void after(){
        System.out.println("结束");
    }
    public void error(Throwable throwable){
        System.out.println("报错");
    }
}
