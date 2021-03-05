package com.liqinchun.knowledge.knowledge.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@ConfigurationPropertiesScan
public class KnowledgeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnowledgeSpringApplication.class, args);
	}

}
