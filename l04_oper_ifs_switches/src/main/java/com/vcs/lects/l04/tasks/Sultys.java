package com.vcs.lects.l04.tasks;

public class Sultys {

    public boolean arNeraLikucio_1(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis) {
        return sulciuKiekisViso % talposTuris == 0;
    }

    public boolean arNeraLikucio_2(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis) {

        boolean arNeraLikucio = sulciuKiekisViso % talposTuris == 0;
        boolean arLyginis = ((double) sulciuKiekisViso / talposTuris) % 2 == 0;

        return arNeraLikucio && (arLyginis || !reikalingasTikLyginis);
    }

    public boolean arNeraLikucio_Martynas(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis) {

        boolean one = (sulciuKiekisViso % talposTuris) == 0;
        boolean two = reikalingasTikLyginis  && ((double) sulciuKiekisViso / talposTuris) % 2 == 0;
        boolean three = !reikalingasTikLyginis  && one;
        return three || one && two;

    }

}
