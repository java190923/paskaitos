package com.vcs.lects.l12.codesplit;

public class Main {
    public static void main(String[] args) {

        DuomenuIsvedimas01 di1 = new DuomenuIsvedimas01() {
            @Override
            public void out(String line) {
                System.err.println("RED: " + line);
            }
        };

        System.out.println();

        di1.isvesti("Pirma  eilute", "antra eilute", "", "ketvirta", null, "5");

        DuomenuIsvedimas02 di2 = new DuomenuIsvedimas02() {
            @Override
            public void out(String line) {
                System.out.println(line.length());
            }
        };

        di2.isvesti("Pirma  eilute", "antra eilute", "", "ketvirta", null, "5");


        System.out.println();

        DuomenuIsvedimas03 di3 = new DuomenuIsvedimas03();
        di3.isvesti((line) -> System.err.println("RED: " + line), "Pirma  eilute", "antra eilute", "", "ketvirta", null, "5");

        System.out.println();

        DuomenuIsvedimas04 di4 = new DuomenuIsvedimas04();
        di4.isvesti((line, valid) -> System.err.println((valid ? "RED: " + line : "(not valid)")), "Pirma  eilute", "antra eilute", "", "ketvirta", null, "6");


        System.out.println();

        DuomenuIsvedimas05 di5 = new DuomenuIsvedimas05();
        di5.isvesti(
                (line, valid) -> System.err.println((valid ? "RED: " + line : "(not valid)")),
                "Pirma  eilute", "antra eilute", "", "ketvirta", null, "6"
        );

        System.out.println();

        di5.isvesti(
                (line, valid) -> System.err.println((valid ? "RED: " + line : "(not valid)")),
                (line) -> line != null,
                "Pirma  eilute", "antra eilute", "", "ketvirta", null, "6"
        );


    }
}
