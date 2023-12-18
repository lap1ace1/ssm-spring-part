package com.lihanlin.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


//环绕通知，需要在通知中定义目标方法的执行
@Component
@Aspect
public class TxAroundAdvice {
    @Around("com.lihanlin.pointCut.MyPointCut.pc()")
    public Object transaction(ProceedingJoinPoint joinPoint){

        Object[] args = joinPoint.getArgs();
        Object result = null;
        try {
            result = joinPoint.proceed(args);
        } catch (Throwable e) {
            System.out.println("事务回滚");
            throw new RuntimeException(e);
        }

        return result;
    }
}
