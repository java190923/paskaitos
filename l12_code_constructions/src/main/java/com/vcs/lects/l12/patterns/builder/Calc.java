package com.vcs.lects.l12.patterns.builder;

public class Calc {

    private double rez = 0;

    public Calc(double sk) {
        rez = sk;
    }

    public Calc prideti(double sk) {
        rez += sk;
        return this;
    }

    public Calc atimti(double sk) {
        rez -= sk;
        return this;
    }

    public Calc prideti(boolean sk) {
        rez += (sk ? 1 : -1);
        return this;
    }

    public Calc prideti(Boolean sk) {
        if (sk != null) {
            rez += (sk ? 1 : -1);
        }
        return this;
    }

    public Calc atimti(boolean sk) {
        return prideti(!sk);
    }

    public Calc atimti(Boolean sk) {
        return prideti((sk == null ? null : !sk));
    }

    public Calc dalinti(double sk) {
        rez /= sk;
        return this;
    }

    public Calc dauginti(double sk) {
        rez *= sk;

        return this;
    }

    public void spausdinkResult() {
        System.out.println("rez: " + rez);

    }

    public double tikRez() {
        return rez;
    }



}
