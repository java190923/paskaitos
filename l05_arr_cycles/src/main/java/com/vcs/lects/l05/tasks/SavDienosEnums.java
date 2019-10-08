package com.vcs.lects.l05.tasks;

public class SavDienosEnums {

    public String weekDayToStr(int i) {
        return SavDiena.values()[i - 1].toString();
    }


    public static void main(String[] args) {
        System.out.println( SavDiena.weekDayToStr(5));
    }
}
