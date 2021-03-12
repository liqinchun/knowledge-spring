package com.liqinchun.knowledge.knowledge.spring.aop;

import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanNameAutoProxyCreatorAop {

    public void name(){
        System.out.println("CustomBeanNameAutoProxyCreatorAop"+ CustomBeanNameAutoProxyCreatorAop.class);
    }
}
