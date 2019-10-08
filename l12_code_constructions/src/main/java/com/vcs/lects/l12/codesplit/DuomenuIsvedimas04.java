package com.vcs.lects.l12.codesplit;

public class DuomenuIsvedimas04 {


    public void isvesti(OutHandler04 outHandler, String... lines) {
        for (String line : lines) {
            if (line != null && !line.isEmpty()) {
                outHandler.out(line, true);
            } else {
                outHandler.out(line, false);
            }
        }
    }

}
