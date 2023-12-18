package com.lihanlin.pointCut;


import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切点统一管理
@Component
public class MyPointCut {
    @Pointcut("execution(* com..impl.*.*(..))")
    public void pc(){}
}
