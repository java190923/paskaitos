package com.vcs.lects.l12.codesplit;

public class DuomenuIsvedimas03 {


    public void isvesti(OutHandler03 outHandler, String... lines) {
        for (String line : lines) {
            if (line != null && !line.isEmpty()) {
                outHandler.out(line);
            }
        }
    }



}
