package com.liqinchun.knowledge.knowledge.spring.annotation.importannotation;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;


public class CustomImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {


    /**
     * 与registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry)方法的区别
     * 如果没有实现registerBeanDefinitions方法，那么会调用模板方法中的registerBeanDefinitions
     * 模板方法中的registerBeanDefinitions 会直接调用registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry)方法
     * @param importingClassMetadata
     * @param registry
     * @param importBeanNameGenerator
     * @see ImportBeanDefinitionRegistrar#registerBeanDefinitions(AnnotationMetadata, BeanDefinitionRegistry)
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        System.out.println("CustomImportBeanDefinitionRegister registerBeanDefinitions importBeanNameGenerator");
        RootBeanDefinition beanDefinition = new RootBeanDefinition(ImportBeanDefinitionRegisterClassA.class);
        registry.registerBeanDefinition("importBeanDefinitionRegisterClassA",beanDefinition);
    }

    /**
     * 要实现ImportBeanDefinitionRegistrar注入bean，如果没有实现{@link ImportBeanDefinitionRegistrar#registerBeanDefinitions
     * (AnnotationMetadata, BeanDefinitionRegistry, BeanNameGenerator)}
     * 那么必须实现{@link ImportBeanDefinitionRegistrar#registerBeanDefinitions(AnnotationMetadata, BeanDefinitionRegistry)}
     * 默认的{@link ImportBeanDefinitionRegistrar#registerBeanDefinitions(AnnotationMetadata, BeanDefinitionRegistry, BeanNameGenerator)}
     * 直接调用{@link ImportBeanDefinitionRegistrar#registerBeanDefinitions(AnnotationMetadata, BeanDefinitionRegistry)}
     * @param importingClassMetadata
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(ImportBeanDefinitionRegisterClassA.class);
        registry.registerBeanDefinition("importBeanDefinitionRegisterClassA",beanDefinition);
    }
}
