package com.liqinchun.knowledge.knowledge.spring.annotation.importannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@DependsOn("com.liqinchun.knowledge.knowledge.spring.annotation.importannotation.ImportClassA")
public class ImportService {

    @Autowired
    ImportClassA importClassA;


    public ImportService(ImportClassA importClassA,
                         ImportBeanDefinitionRegisterClassA importBeanDefinitionRegisterClassA,ImportSelectorA importSelectorA){
        System.out.println("ImportService");
        System.out.println(importClassA);
        System.out.println("importBeanDefinitionRegisterClassA:"+importBeanDefinitionRegisterClassA);
        System.out.println("ImportSelectorA:"+importSelectorA);
    }
}
