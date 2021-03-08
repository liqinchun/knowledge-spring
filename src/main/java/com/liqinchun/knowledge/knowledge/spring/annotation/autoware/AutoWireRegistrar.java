package com.liqinchun.knowledge.knowledge.spring.annotation.autoware;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

public class AutoWireRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry){
        GenericBeanDefinition gbd= (GenericBeanDefinition) registry.getBeanDefinition("autoWareBa");
        GenericBeanDefinition gAutoWareAnnotationbd= (GenericBeanDefinition) registry.getBeanDefinition("autoWareAnnotation");
        //设置为byType
//        gbd.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);
        gAutoWareAnnotationbd.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
        //重新注册到Spring容器中
        registry.removeBeanDefinition("autoWareBa");
        registry.removeBeanDefinition("autoWareAnnotation");
        registry.registerBeanDefinition("autoWareB",gbd);
        registry.registerBeanDefinition("autoWareAnnotation",gAutoWareAnnotationbd);
    }
}
