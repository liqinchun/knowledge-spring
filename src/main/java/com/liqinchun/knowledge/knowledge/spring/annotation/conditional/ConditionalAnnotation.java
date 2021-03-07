package com.liqinchun.knowledge.knowledge.spring.annotation.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionalAnnotation implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String className = context.getClass().getName();
        if (className.contains("ServiceTestServiceAnnotationScan"))
        return false;
        return true;
    }
}
