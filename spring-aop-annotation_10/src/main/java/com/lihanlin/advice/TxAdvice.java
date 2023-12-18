package com.lihanlin.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TxAdvice {
    @Before("com.lihanlin.pointCut.MyPointCut.pc()")
    public void begin(){
        System.out.println("开启事务");
    }
    @AfterReturning("com.lihanlin.pointCut.MyPointCut.pc()")
    public void commit(){
        System.out.println("事务提交");
    }
    @AfterThrowing("com.lihanlin.pointCut.MyPointCut.pc()")
    public void rollback(){
        System.out.println("事物回滚");
    }
}
