package com.liqinchun.knowledge.knowledge.spring.annotation.autoware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutowireC {
    @Autowired
    AutowireD autowireD;
}
