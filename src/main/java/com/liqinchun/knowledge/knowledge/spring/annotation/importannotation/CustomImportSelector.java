package com.liqinchun.knowledge.knowledge.spring.annotation.importannotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Configuration
public class CustomImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("CustomImportSelector  selectImports");
        return new String[]{"com.liqinchun.knowledge.knowledge.spring.annotation.importannotation.ImportSelectorA"};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        System.out.println("CustomImportSelector  getExclusionFilter");
        return null;
    }
}
