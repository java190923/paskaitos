package com.vcs.lects.l12.codesplit;

public abstract class DuomenuIsvedimas02 {


    public void isvesti(String... lines) {
        for (String line : lines) {
            if (line != null && !line.isEmpty()) {
                out(line);
            }
        }
    }

    public abstract void out(String line) ;


}
