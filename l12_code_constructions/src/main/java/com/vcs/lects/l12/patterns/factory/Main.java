package com.vcs.lects.l12.patterns.factory;

import com.vcs.lects.l12.patterns.factory.auto.Automobilis;
import com.vcs.lects.l12.patterns.factory.auto.AutomobilisFactory;
import com.vcs.lects.l12.patterns.factory.auto.Mazda;

public class Main {

    public static void main(String[] args) {

        Automobilis a = AutomobilisFactory.createInstance(false);


        Automobilis auto1 = AutomobilisFactory.createInstance();
        System.out.println(auto1.getvin());


        Automobilis auto2 = AutomobilisFactory.createInstance();
        System.out.println(auto2.getvin());

        Automobilis auto3 = AutomobilisFactory.createInstance(true);
        System.out.println(auto3.getvin());


        //Automobilis auto4 = new Mazda(auto3.getvin());
        //System.out.println(auto4.getvin());
    }
}
