package com.vcs.lects.l12.patterns.factory.auto;


/**
 * @see AutomobilisFactory
 * */
public abstract class Automobilis {

    private String vin;

    /**
     * @see AutomobilisFactory
     * */
    Automobilis(String vin) {
        this.vin = vin;
    }

    public String getvin() {
        return vin;
    }


}
