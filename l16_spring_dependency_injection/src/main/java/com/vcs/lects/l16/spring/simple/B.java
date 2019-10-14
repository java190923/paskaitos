package com.vcs.lects.l16.spring.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    @Autowired
    private A a;


//    public B(A a) {
//        this.a = a;
//    }
}
