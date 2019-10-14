package com.vcs.lects.l16.spring.auto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CityBeeCarsRent {


    @Autowired
    private Fiat fiat;

    @Autowired
    private Citroen citroen;

    @Value("${better:false}")
    private boolean better;

    @Autowired
    @Qualifier("version")
    private String about;

    @Autowired
    private String helloWorld;

    public Car takeCarForRent() {

        System.out.println("Rent car, code version: " + helloWorld);
        System.out.println("Rent car, code version: " + about);

        if (better) {
            return fiat;
        }



        return citroen;
    }

}
