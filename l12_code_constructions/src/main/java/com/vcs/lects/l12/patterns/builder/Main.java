package com.vcs.lects.l12.patterns.builder;

public class Main {

    public static void main(String[] args) {


        Calc calc = new Calc(0);
        calc.prideti(10);
        calc.prideti(true);
        calc.dalinti(3.0);
        calc.atimti(4);
        calc.dauginti(2.0);
        calc.spausdinkResult();
//        calc


        // Builder usage:
        new Calc(0).prideti(10).prideti(true).dalinti(3.0).atimti(4).dauginti(2.0).spausdinkResult();


    }
}
