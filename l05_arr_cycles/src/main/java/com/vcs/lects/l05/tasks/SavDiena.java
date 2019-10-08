package com.vcs.lects.l05.tasks;

public enum SavDiena {

    Pirmadineis, Antradienis, Treciadienis, Ketvirtadienis, Penktadineis, Sestadienis, Sekmadineis;



    public static String weekDayToStr(int i) {
        return SavDiena.values()[i - 1].toString();
    }

    }
