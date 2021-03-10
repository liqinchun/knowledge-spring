package com.liqinchun.knowledge.knowledge.spring.annotation.importannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan("com.liqinchun.knowledge.knowledge.spring.annotation.importannotation")

public class ImportBoot {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(ImportBoot.class);
        System.out.println(annotationConfigApplicationContext.getBean(ImportClassA.class));
        System.out.println(annotationConfigApplicationContext.getBean(ImportClassA.class));
    }
}
