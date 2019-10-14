package com.vcs.lects.l16.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teodoras extends Driver {

    private Car car;

    @Autowired
    private CityBeeCarsRent rent;


    @Override
    public Car getCar() {

        if (car == null) {
            car = rent.takeCarForRent();
        }

        return car;
    }


}
