package com.liqinchun.knowledge.knowledge.spring.annotation.importannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({CustomImportBeanDefinitionRegister.class,CustomImportSelector.class})
public class ImportConfig {
}
