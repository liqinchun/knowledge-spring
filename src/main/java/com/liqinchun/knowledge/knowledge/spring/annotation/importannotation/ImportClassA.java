package com.liqinchun.knowledge.knowledge.spring.annotation.importannotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

public class ImportClassA {
    public ImportClassA(){
        System.out.println("instance ImportClassA");
    }
}
