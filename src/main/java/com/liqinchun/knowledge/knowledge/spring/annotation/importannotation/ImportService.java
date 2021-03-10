package com.liqinchun.knowledge.knowledge.spring.annotation.importannotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@DependsOn("com.liqinchun.knowledge.knowledge.spring.annotation.importannotation.ImportClassA")
@Import(ImportClassA.class)
@Data
public class ImportService {

    @Autowired
    ImportClassA importClassA;
    public ImportService(
                         ImportBeanDefinitionRegisterClassA importBeanDefinitionRegisterClassA,ImportSelectorA importSelectorA){
        System.out.println("ImportService");
        //实例化，还没有属性填充。所以这里的importClassA是null
        System.out.println(importClassA);
        System.out.println("importBeanDefinitionRegisterClassA:"+importBeanDefinitionRegisterClassA);
        System.out.println("ImportSelectorA:"+importSelectorA);
    }

}
