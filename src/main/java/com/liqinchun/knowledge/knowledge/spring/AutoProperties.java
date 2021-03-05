package com.liqinchun.knowledge.knowledge.spring;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "autoconfig")
@Data
public class AutoProperties {
    private String name;

}
