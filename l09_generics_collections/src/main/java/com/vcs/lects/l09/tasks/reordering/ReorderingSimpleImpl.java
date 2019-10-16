package com.vcs.lects.l09.tasks.reordering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReorderingSimpleImpl implements IReordering {


    @Override
    public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {


        Map<String, List<Mokinys>> listasPo = new HashMap<>();
        listasPo.put("0", new ArrayList<>());
        listasPo.put("1", new ArrayList<>());
        listasPo.put("2", new ArrayList<>());
        listasPo.put("3", new ArrayList<>());
        listasPo.put("4", new ArrayList<>());
        listasPo.put("5", new ArrayList<>());
        listasPo.put("6", new ArrayList<>());
        listasPo.put("7", new ArrayList<>());
        listasPo.put("8", new ArrayList<>());
        listasPo.put("9", new ArrayList<>());


        for (List<Mokinys> listOfMokiniai : mokiniai.values()) {
            for (Mokinys mokinys : listOfMokiniai) {
                double average = mokinys.getVidurkis();

                if (average >= 0 && average < 1) {
                    listasPo.get("0").add(mokinys);
                } else if (average >= 1 && average < 2) {
                    listasPo.get("1").add(mokinys);
                } else if (average >= 2 && average < 3) {
                    listasPo.get("2").add(mokinys);
                } else if (average >= 3 && average < 4) {
                    listasPo.get("3").add(mokinys);
                } else if (average >= 4 && average < 5) {
                    listasPo.get("4").add(mokinys);
                } else if (average >= 5 && average < 6) {
                    listasPo.get("5").add(mokinys);
                } else if (average >= 6 && average < 7) {
                    listasPo.get("6").add(mokinys);
                } else if (average >= 7 && average < 8) {
                    listasPo.get("7").add(mokinys);
                } else if (average >= 8 && average < 9) {
                    listasPo.get("8").add(mokinys);
                } else if (average >= 9 && average <= 10) {
                    listasPo.get("9").add(mokinys);
                }
            }
        }

        List<List<Mokinys>> result = new ArrayList<>();

        if (!listasPo.get("0").isEmpty()) result.add(listasPo.get("0"));
        if (!listasPo.get("1").isEmpty()) result.add(listasPo.get("1"));
        if (!listasPo.get("2").isEmpty()) result.add(listasPo.get("2"));
        if (!listasPo.get("3").isEmpty()) result.add(listasPo.get("3"));
        if (!listasPo.get("4").isEmpty()) result.add(listasPo.get("4"));
        if (!listasPo.get("5").isEmpty()) result.add(listasPo.get("5"));
        if (!listasPo.get("6").isEmpty()) result.add(listasPo.get("6"));
        if (!listasPo.get("7").isEmpty()) result.add(listasPo.get("7"));
        if (!listasPo.get("8").isEmpty()) result.add(listasPo.get("8"));
        if (!listasPo.get("9").isEmpty()) result.add(listasPo.get("9"));

        return result;
    }

}
