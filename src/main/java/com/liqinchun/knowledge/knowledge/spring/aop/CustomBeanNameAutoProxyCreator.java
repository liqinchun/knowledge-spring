package com.liqinchun.knowledge.knowledge.spring.aop;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.stereotype.Component;

//@Component
public class CustomBeanNameAutoProxyCreator extends BeanNameAutoProxyCreator {

    public CustomBeanNameAutoProxyCreator(){
        this.setBeanNames("customBeanNameAutoProxyCreatorAop");
    }
}
