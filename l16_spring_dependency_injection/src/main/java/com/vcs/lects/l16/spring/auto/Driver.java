package com.vcs.lects.l16.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Driver {


    private String name;


    public Driver(String name) {
        this.name = name;
    }

    public Driver() {
        this.name = this.getClass().getSimpleName();
    }

    public abstract Car getCar();


    public String getName() {
        return name;
    }

}
