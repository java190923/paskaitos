package com.vcs.lects.l14.files.res05_properties_resource;

import java.util.Locale;

public class PropertiesWithLocale {

    public static void main(String[] args) {

        MonthConverter mConverter = new MonthConverter();

       // System.out.println( mConverter.monthToString(6, new Locale("lt", "GB")) );
        System.out.println( mConverter.monthToString(6, new Locale("lt", "GB")) );

       // System.out.println( mConverter.monthToString(13, new Locale("lt", "GB")) );

    }

}
