package com.liqinchun.knowledge.knowledge.spring.extensionpoints;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomAutowireBeanPostProcess extends AutowiredAnnotationBeanPostProcessor {

    public CustomAutowireBeanPostProcess() {
        System.out.println("实例化CustomAutowireBeanPostProcess");
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before init bean"+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after init bean"+beanName);
        return bean;
    }
}
