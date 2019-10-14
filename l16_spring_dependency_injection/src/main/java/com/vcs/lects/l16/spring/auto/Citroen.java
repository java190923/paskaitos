package com.vcs.lects.l16.spring.auto;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
@Component
public class Citroen implements Car {


    private static int c = 0;

    public Citroen() {
        System.out.println("citroen count:  " + c++);

    }

    @Override
    public void uzvesti() {
        System.out.println("vroom vroom");
    }
}
