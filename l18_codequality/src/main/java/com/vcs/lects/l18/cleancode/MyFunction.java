package com.vcs.lects.l18.cleancode;

public class MyFunction {


    public int functionName01(int a, int b) {
        return 0;
    }

    public int functionName02(int a) {
        return functionName02_inner(a);
    }


    private int functionName02_inner(int a) {
        return 0;
    }


    public int functionName03(int... a) {

        return functionName02_inner(a[0]) + 4576;
    }


}
