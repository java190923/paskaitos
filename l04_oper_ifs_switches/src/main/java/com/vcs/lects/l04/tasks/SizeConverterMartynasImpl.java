package com.vcs.lects.l04.tasks;

public class SizeConverterMartynasImpl {

    /**
     * 0 bytes ...; 1kb ... ; 1Mb... 1Gb ... ; 1Tb and more;
     * <p>
     * Example: 1,3Gb // <- Acceptable 893Kb // <- Acceptable 1Gb and 312Mb and
     * ...// <- Not acceptable
     * <p>
     * <p>
     * <p>
     * http://byteconvert.org/
     */
    private static final long TB = 1099511627776L;
    private static final long GB = 1073741824;
    private static final long MB = 1048576;
    private static final long KB = 1024;
    private static final long B = 1;

    public String convertToHumanReadable(long sizeInBytes) {
        return rounder(sizeInBytes);
    }

    public String rounder(long number) {
        if (number >= TB) {
            return calculateFinal(number, TB) + " Tb";
        } else if (number >= GB) {
            return calculateFinal(number, GB) + " Gb";
        } else if (number >= MB) {
            return calculateFinal(number, MB) + " Mb";
        } else if (number >= KB) {
            return number / KB + " Kb";
        } else if (number >= B) {
            return number + " b";
        }
        return "";
    }

    public String calculateFinal(long number, long divider) {
        if (number % divider == 0 && number * 1.0 / divider == number / divider) {
            return "" + (number / divider);
        } else {
            return parse("" + (number * 1.0 / divider));
        }
    }

    public String parse(String text) {
        String[] x = text.split("\\.");
        String poKablelio = x[1].substring(0, 1);
        if ("0".equals(poKablelio)) {
            return x[0];
        } else {
            return x[0] + "." + x[1].substring(0, 1);
        }
    }
}
