package com.liqinchun.knowledge.knowledge.spring.aop;

import lombok.With;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
@Aspect
public class LogAspectJ {

    @Pointcut("execution( * com.liqinchun.knowledge.knowledge.spring..aop.*.print* (..))")
    public void logPointcut(){
    }
    @Pointcut("within(com.liqinchun.knowledge.knowledge.spring..aop.ClassA))")
    public void withinLogPointcut(){
    }

    @Before("withinLogPointcut()")
    public void beforeAndWithin(){

    }
//    @Before("")
    public void beforeAndTarget() {

    }

    @Before("withinLogPointcut()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("begin args"+args.toString());

    }

    @After("logPointcut()")
    public void after(JoinPoint pjp){
        System.out.println("after环绕通知");
    }

    @Around("logPointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知");
        joinPoint.proceed();
        System.out.println("环绕通知over");
    }

    /**
     *
     * @param a 指定返回ClassA 时才对
     */
    @AfterReturning(value = "logPointcut()",returning = "a")
    public void afterReturning(String a){
        System.out.println("afterReturning");

    }

    /**
     *
     * @param ex 指定抛出的异常为Exception才代理
     */
    @AfterThrowing(value = "logPointcut()",throwing = "ex")
    public void afterThrowing(Exception ex){
        System.out.println("afterThrowing");
    }



}
