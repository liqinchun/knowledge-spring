package com.liqinchun.knowledge.knowledge.spring.annotation.componentscan;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyScanFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类的注解源信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //class的辕信息
        metadataReader.getClassMetadata();
        //类资源信息
        metadataReader.getResource();
        //return true/false  true加载  false不加载
        return true;
    }
}
