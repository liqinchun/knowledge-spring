package com.liqinchun.knowledge.knowledge.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("classA")
@Slf4j
public class ClassA {

    private void printNameString(){
        System.out.println("我是classA："+this);
    }

    public ClassA(){
    }
    String printName() {
        printNameString();
        return "";
    }
}
