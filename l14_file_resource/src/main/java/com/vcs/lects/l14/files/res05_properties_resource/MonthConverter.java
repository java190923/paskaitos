package com.vcs.lects.l14.files.res05_properties_resource;


import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;


public class MonthConverter {

    private static final String NAME_BASE_MONTH = "month";
    private static final String KEY_PREFIX = "m_";


    public String monthToString(int month) {
        return monthToString(month, Locale.getDefault());
    }

    public String monthToString(int month, Locale loc) {
        ResourceBundle rb = ResourceBundle.getBundle(NAME_BASE_MONTH, loc);

        try {
            return rb.getString(KEY_PREFIX + month);
        } catch (MissingResourceException e) {
            return "???" + KEY_PREFIX + month + "???";
        }

    }
}
