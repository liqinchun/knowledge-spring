package com.liqinchun.knowledge.knowledge.spring;

import com.liqinchun.knowledge.knowledge.spring.annotation.autoware.AutoWireRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
public class KnowledgeSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KnowledgeSpringApplication.class, args);
		System.out.println(context.getBean("annotationService"));
		System.out.println(context.getBean("org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory"));
		System.out.println(context.getBean("&org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory"));
		System.out.println(context.getBean("autowireByNameAa"));
		Object bean = context.getBean("autoWareAnnotation");
		System.out.println(bean);
	}

}
