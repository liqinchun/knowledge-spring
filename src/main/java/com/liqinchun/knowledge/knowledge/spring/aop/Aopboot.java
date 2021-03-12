package com.liqinchun.knowledge.knowledge.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
@ComponentScan("com.liqinchun.knowledge.knowledge.spring.aop")
public class Aopboot {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                cxt = new AnnotationConfigApplicationContext(Aopboot.class);
        ClassA classA = cxt.getBean("classA",ClassA.class);
        classA.printName();
    }

}
