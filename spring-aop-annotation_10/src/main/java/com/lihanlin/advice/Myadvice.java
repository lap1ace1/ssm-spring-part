package com.lihanlin.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//定义四个增强方法，获取目标方法的信息 返回值 异常对象
@Component
@Aspect
public class Myadvice {
    @Before("com.lihanlin.pointCut.MyPointCut.pc()")
    public void before(JoinPoint joinPoint){
        //1.获取方法属于类的信息
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        //2.获取方法名
        String name = joinPoint.getSignature().getName();
        //3.获取参数列表
        Object[] args = joinPoint.getArgs();
    }
    @AfterReturning(value = "com.lihanlin.pointCut.MyPointCut.pc()",returning = "result")
    public void afterReturn(JoinPoint joinPoint,Object result){

    }
    @After("com.lihanlin.pointCut.MyPointCut.pc()")
    public void after(JoinPoint joinPoint){

    }
    @AfterThrowing(value = "execution(* com..impl.*.*(..))",throwing = "throwable")
    public void afterThrow(JoinPoint joinPoint,Throwable throwable){

    }
}
