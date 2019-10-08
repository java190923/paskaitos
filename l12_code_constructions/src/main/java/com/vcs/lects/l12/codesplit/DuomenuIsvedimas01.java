package com.vcs.lects.l12.codesplit;

public class DuomenuIsvedimas01 {


    public void isvesti(String... lines) {
        for (String line : lines) {
            if (line != null && !line.isEmpty()) {
                out(line);
            }
        }
    }

    public void out(String line) {
        System.out.println(line);
    }


}
