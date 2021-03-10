package com.liqinchun.knowledge.knowledge.spring.annotation.importannotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

public class CustomImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("CustomImportSelector  selectImports");
        //注入为类的全路径名
        return new String[]{"com.liqinchun.knowledge.knowledge.spring.annotation.importannotation.ImportSelectorA"};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        System.out.println("CustomImportSelector  getExclusionFilter");
        return null;
    }
}
