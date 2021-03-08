package com.liqinchun.knowledge.knowledge.spring.annotation.autoware;

import jdk.swing.interop.SwingInterOpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AutoWareAnnotation {


    @Autowired
    public AutoWareAnnotation() {
    }
    public void setAutoWareBa(AutoWareB autoWareBa){
        System.out.println("setAutoWareB AutoWareB:"+autoWareBa);
    }
    public void setAutoWareB(){
        System.out.println("setAutoWareB");
    }

//    public AutoWareB getAutoWareB() {
//        return null;
//    }

    public AutoWareAnnotation(String str) {
        log.info(str);
    }


}
