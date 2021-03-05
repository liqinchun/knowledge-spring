package com.liqinchun.knowledge.knowledge.spring.annotation.componentscan;

import com.liqinchun.knowledge.knowledge.spring.annotation.AnnotationService;
import com.liqinchun.knowledge.knowledge.spring.annotation.configuration.ConfigAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

/**
 * 在使用includeFilters时需要关闭默认过滤器useDefaultFilters = false
 * 默认扫描带 @Component @Repository, @Service, @Controller
 * FilterType
 *   ANNOTATION  注解
 *   ASSIGNABLE_TYPE 指定类型
 *   ASPECTJ aspectJ形式的
 *   REGEX 正则
 *   CUSTOM 自定义的
 */

@ComponentScan(value = "com.liqinchun.knowledge.knowledge.spring.annotation",useDefaultFilters = false,excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {AnnotationService.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = MyScanFilter.class)
},includeFilters = {})
public class ComponentScanAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ComponentScanAnnotation.class);

    }
}
