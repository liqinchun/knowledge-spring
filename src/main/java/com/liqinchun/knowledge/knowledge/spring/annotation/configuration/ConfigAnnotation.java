package com.liqinchun.knowledge.knowledge.spring.annotation.configuration;

import com.liqinchun.knowledge.knowledge.spring.annotation.AnnotationService;
import com.liqinchun.knowledge.knowledge.spring.annotation.autoware.AutoWireRegistrar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;


@Slf4j
@ComponentScan(value = "com.liqinchun.knowledge.knowledge.spring.annotation")
@Import(AutoWireRegistrar.class)

public class ConfigAnnotation {

    /**
     * @Bean 默认单实例  饿汉加载
     * 当指定@Scope为prototype时表示为多实例，懒汉加载(在第一次使用的时候创建)
     * @Lazy 针对单实例情况下，容器启动时不创建对象
     * @return
     */
//    @Bean
//    @Scope(value = "prototype")
//    @Lazy
    public ConfigurationService configurationService(){
        log.info("创建实例configurationService");
        return new ConfigurationService();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigAnnotation.class);

    }
}
