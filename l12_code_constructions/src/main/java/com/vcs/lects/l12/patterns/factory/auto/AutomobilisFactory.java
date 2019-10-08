package com.vcs.lects.l12.patterns.factory.auto;

import java.util.UUID;

public class AutomobilisFactory {

    private static int unicCounter = 0;

    public static Automobilis createInstance() {
        return createInstance(false);
    }

    public static Automobilis createInstance(boolean moreExpensive) {
        UUID id = UUID.randomUUID();
        if (moreExpensive) {
            return new Mazda("MZD-" + id.toString());
        }
        return new Multipla("F-" + id.toString());
    }


}
