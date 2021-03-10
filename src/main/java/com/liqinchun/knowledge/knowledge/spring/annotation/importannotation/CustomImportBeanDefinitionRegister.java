package com.liqinchun.knowledge.knowledge.spring.annotation.importannotation;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;


public class CustomImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        System.out.println("CustomImportBeanDefinitionRegister registerBeanDefinitions importBeanNameGenerator");
        RootBeanDefinition beanDefinition = new RootBeanDefinition(ImportBeanDefinitionRegisterClassA.class);
        registry.registerBeanDefinition("importBeanDefinitionRegisterClassA",beanDefinition);
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(ImportBeanDefinitionRegisterClassA.class);
        registry.registerBeanDefinition("importBeanDefinitionRegisterClassA",beanDefinition);
    }
}
