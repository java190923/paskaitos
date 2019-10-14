package com.vcs.lects.l16.spring.auto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Antanas extends Driver {

//    @Autowired
//    @Qualifier("citroen")
//    private Car car;


    @Autowired
    private Teodoras t;

    @Override
    public Car getCar() {
        return t.getCar();
    }
}
