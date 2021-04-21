package com.liqinchun.knowledge.knowledge.spring;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
@NacosPropertySource(dataId = "config", autoRefreshed = true)
public class KnowledgeSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(KnowledgeSpringApplication.class, args);
        System.out.println(context.getBean("annotationService"));
        System.out.println(
                context.getBean(
                        "org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory"));
        System.out.println(
                context.getBean(
                        "&org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory"));
        System.out.println(context.getBean("autowireByNameAa"));
        System.out.println(context.getBean("classA"));
        Object bean = context.getBean("autoWareAnnotation");
        System.out.println(bean);
    }
}
