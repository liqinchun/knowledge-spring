package com.liqinchun.knowledge.knowledge.spring.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Autowired ObjectMapper objectMapper;
}
