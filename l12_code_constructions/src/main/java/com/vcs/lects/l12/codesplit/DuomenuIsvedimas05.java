package com.vcs.lects.l12.codesplit;

public class DuomenuIsvedimas05 implements DataChecker {


    public void isvesti(OutHandler05 outHandler, String... lines) {
        isvesti(outHandler, this, lines);
    }

    public void isvesti(OutHandler05 outHandler, DataChecker dch, String... lines) {
        for (String line : lines) {
            outHandler.out(line, dch.isValidString(line));
        }
    }

    @Override
    public boolean isValidString(String line) {
        return line != null && !line.isEmpty();
    }
}
