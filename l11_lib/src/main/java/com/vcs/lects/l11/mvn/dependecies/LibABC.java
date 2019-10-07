package com.vcs.lects.l11.mvn.dependecies;

import org.apache.commons.lang3.StringUtils;

public class LibABC {

    @Deprecated
    public int sudetis(int sk1, int sk2) {

        int suma = sk1 + sk2;

        if (suma < 0) {
            System.out.println("Negative value ");
        }

        return suma;
    }

    public int sudetis(String sk1, String sk2) {

        if (StringUtils.isNumeric(sk1) && StringUtils.isNumeric(sk2)) {
            int suma = Integer.parseInt(sk1) - Integer.parseInt(sk2);

            if (suma < 0) {
                System.out.println("Negative value ");
            }
            return suma;
        }
        return 0;

    }

}
