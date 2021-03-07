package com.liqinchun.knowledge.knowledge.spring.annotation;

import com.liqinchun.knowledge.knowledge.spring.annotation.configuration.ConfigurationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AnnotationService {
    @Autowired
    ConfigurationService configurationService;

    public AnnotationService() {
        System.out.println("configurationService:{}"+configurationService);
    }
}
