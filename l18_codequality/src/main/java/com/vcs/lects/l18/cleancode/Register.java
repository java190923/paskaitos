package com.vcs.lects.l18.cleancode;


/**
 * <ul>
 *
 * <li>Naming convention: https://en.wikipedia.org/wiki/Naming_convention_(programming)</li>
 * <li>Kintamuju pavadinimu ilgis tiesiogiai turetu priuklausyti nuo to
 * kintamojo scope'o: kuo didesnis kintamojo scope'as - tuo tikslesnis pavadinimas turetu buti</li>
 * <li>Nesikartokim patys saves: person.getPersonName() ... -> person.getName()</li>
 * <li>Klases pavadinimas turi atititikti jos turini</li>
 * <li>Jeigu nepavyksta sugalvoti taiklaus klases pavadinimo - refactoring
 * indikacija</li>
 * <li>Jeigu nepavuksta pavadinti metodo - jis daro per daug</li>
 * <li>Blogas kodas daro per daug! Geras kodas - konkreciai ir glaustai</li>
 * <li>Komentarai - aiskinimas kaip tas turi buti naudojama ar kaip veikti: refactor indikacija</li>
 * <li>Jeigu rasai komentara, pagalvok ar butu galima tiesiog pataisyti koda. Jei ne - rasyk komentara</li>
 * <li>Package'ai - turi nusakyti konteksta savo pavadinimu</li>
 * <p>
 * <br/>
 *
 * <li>Palikti galimybe koda plesti ir vystyti nekoreguojant orginalaus: vengti static ir final jie to nebutina</li>
 * <li>Dependencies: kuo maziau tuo geriau.</li>
 * </ul>
 *
 * <p>
 * Rekomendacijos, bet ne taisykles:
 *
 * <li>Metodo ilgis - iki 20 eiluciu</li>
 * <li>Klases ilgis - iki 200 eiluciu</li>
 * </p>
 * <p>
 * <p>
 * <h2><b>SOLID</b></h2>
 * <li><a href="https://en.wikipedia.org/wiki/SOLID">SOLID</a></li>
 * <p>
 * <li>Single responsibility principle
 * <ul>
 * <li>Klase turi buti atsakinga uz viena dalyka</li>
 * <li>Metodas turi daryti viena dalyka ir ji turi daryti gerai</li>
 * </ul>
 * </li>
 * <li>Open/closed principle
 * <ul>
 * <li>
 * Kodas atviras pleciamumui, bet uzdaras modifikacijoms.
 * </li>
 * </ul>
 * </li>
 * <li>Liskov substitution principle</li>
 * <li>Dependency inversion principle
 * <ul>
 * <li>Priklausyti nuo abstrakciju geriau nei nuo konkreciu klasiu</li>
 * </ul>
 * </li>
 * <li>Interface segregation principle
 * <ul>
 * <li>Geriau daugiau bet mazesni, negu maziau bet stambesni interfeisai</li>
 * </ul>
 * </li>
 */


public class Register {


    private String name;

    private int count = 8;

    private int myFirsMilion = 1_000_000; // 10
    private int myFirsHex = 0xF; // 16
    private int myFirsOct = 077; // 8
    private int myFirstBin = 0b000011; //2



    @Deprecated
    public void isvedam() {
        //...
    }

    public void checkAndOutput(int count) {

        checkCount(count);

        countOutput();
        //...
    }

    private void countOutput() {
        for (int i = this.count; i < 10; i++) {
            innerCycle(i);
        }
    }

    void innerCycle(int i) {
        for (int j = 0; j < 20; j++) {
            if (isCountFitByIndexes(i, j)) {
                System.out.println("A");
            }
        }
    }

    boolean isCountFitByIndexes(int i, int j) {
        return count > 4 && i * count - j <= 23;
    }

    private void checkCount(int count) {
        if (count < 0) {
            throw new RuntimeException();
        }
    }

    public boolean isRegistered() {
        //...
        return false;
    }


}





