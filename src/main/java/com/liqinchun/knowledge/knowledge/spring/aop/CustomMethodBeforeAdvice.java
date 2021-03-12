package com.liqinchun.knowledge.knowledge.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class CustomMethodBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before:" + method.getName());
    }
}
