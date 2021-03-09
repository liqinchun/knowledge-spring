package com.liqinchun.knowledge.knowledge.spring.annotation.autoware;

import jdk.swing.interop.SwingInterOpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Import({AutoWireRegistrar.class})
public class AutoWareAnnotation {


    @Autowired
    AutoWareB autoWareBc;
    @Autowired
    AutowireByNameA autowireByNam;

    @Autowired
    public AutoWareAnnotation() {
    }
    public void setAutoWareBa(AutoWareB autoWareBa){
        System.out.println("setAutoWareB AutoWareB:"+autoWareBa);
    }
    @Autowired
    public void setAutoWareB(@Autowired AutoWareB autoWareB){
        System.out.println("setAutoWareB");
    }

    public void setAutowireByName(AutowireByNameA autowireByNam){
        System.out.println(autowireByNam);
    }

//    public AutoWareB getAutoWareB() {
//        return null;
//    }

    public AutoWareAnnotation(String str) {
        log.info(str);
    }


}
