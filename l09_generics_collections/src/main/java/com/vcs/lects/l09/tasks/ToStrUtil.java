/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l09.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author owr
 */
public class ToStrUtil {

    public static <O> String toStr(O... objs) {
        return toStr(Arrays.asList(objs));
    }

    public static <O> String toStr(List<O> objs) {
        return toStr(", ", ((o1, o2) -> o1.hashCode() - o2.hashCode()), ((o) -> o.toString()), objs);
    }

    public static <O> String toStr(String sep, Comparator<O> cmp, Function<O, String> conv, O... objs) {
        return toStr(sep, cmp, conv, Arrays.asList(objs));
    }

    private static <O> String toStr(String sep, Comparator<O> cmp, Function<O, String> conv, List<O> objs) {
        return objs.stream().sorted(cmp).map(conv).collect(Collectors.joining(sep));
    }

    private <O> String toStr_imperative(String sep, Comparator<O> cmp, ToStringConverter conv, List<O> objs) {

        Collections.sort(objs, cmp);

        String result = "";
        for (O obj : objs) {
            result += conv.convert(obj) + sep;
        }

        return result;
    }

}
