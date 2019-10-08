package com.vcs.lects.l05.tasks;

import java.util.Arrays;

public class SortTask {

    // Pradiniu duomenu pvz
    // "3242 43 22222 34 1111111 234 234"

    public static void main(String[] args) {
        SortTask st = new SortTask();

        String data = "3242 43 22222 34 1111111 234 234";

        int[] sortedInts = st.sort(data, true);
        System.out.println(Arrays.toString(sortedInts));

        sortedInts = st.sort(data, false);
        System.out.println(Arrays.toString(sortedInts));

    }

    public int[] sort(String strData, boolean asc) {


        String[] strArr = strData.split(" ");
        int[] result = new int[strArr.length];


        for (int i = 0; i < strArr.length; i++) {
            result[i] = Integer.parseInt(strArr[i]);
        }

        return sortIntArr(result, asc);
    }

    private int[] sortIntArr(int[] data, boolean asc) {

        int indexToSwap1 = 0;

        for (int i = 0; i < data.length; i++) {
            indexToSwap1 = i;

            int indexToSwap2 = findExtremum(i, data, asc);
            swap(data, indexToSwap1, indexToSwap2);
        }
        return data;

    }

    private void swap(int[] data, int index1, int index2) {

        int t = data[index1];
        data[index1] = data[index2];
        data[index2] = t;

    }

    private int findExtremum(int fromIndex, int[] data, boolean asc) {

        int extVal = data[fromIndex];
        int extIndex = fromIndex;

        for (int i = fromIndex; i < data.length; i++) {
            if (isItExtremum(extVal, data[i], asc)) {
                extVal = data[i];
                extIndex = i;
            }
        }
        return extIndex;
    }

    private boolean isItExtremum(int equalingVal, int val, boolean asc) {

        if (asc) {
            return equalingVal > val;
        }
        return equalingVal < val;
    }

}
