package com.liqinchun.knowledge.knowledge.spring.extensionpoints;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

//@Service("classAA")
public class FactoryBeanPoint implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new ClassA();
    }

    @Override
    public Class<?> getObjectType() {
        return ClassA.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
