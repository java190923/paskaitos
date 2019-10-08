package com.vcs.lects.l05.tasks;

public class SavDienosArr {


    private String[] days = {"Pirmadineis", "Antradienis", "Treciadienis", "Ketvirtadienis", "Penktadineis", "Sestadienis", "Sekmadineis"};

    public String weekDayToStr(int i) {
        return days[i - 1];
    }

}
