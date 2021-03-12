package com.liqinchun.knowledge.knowledge.spring;

import org.springframework.stereotype.Service;

@Service
public class AutoConfigService {

    public AutoConfigService(AutoProperties autoProperties){
        System.out.println(autoProperties.getName());
    }

    public void print(){

    }
}
