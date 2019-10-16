package com.vcs.lects.l09.tasks.reordering;

import java.util.*;

public class CorparativeDynamicRangesImpl implements IReordering {

    private static final int REZIAI = 10;

    @Override
    public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {
        return orderByAvg(fetchData(mokiniai));
    }

    private List<List<Mokinys>> orderByAvg(List<Mokinys> prData) {
        Map<String, List<Mokinys>> byAvg = initMapByAvg();

        for (int i = 0; i < REZIAI; i++) {
            groupByRange(i, prData, byAvg);
        }

        // paskutinis rezis [9..10] yra su 10 iskaitytinai. Po kiekvieno rezio salinam
        // is pradiniu duomenu mokinius, tad liks tik su 10 vidurkiais
        byAvg.get("" + (REZIAI - 1)).addAll(prData);

        return constructReturn(byAvg);
    }

    private List<List<Mokinys>> constructReturn(Map<String, List<Mokinys>> byAvg) {
        List<List<Mokinys>> result = new ArrayList<>();
        Set<String> keys = byAvg.keySet();

        for (String key : keys) {
            if (!byAvg.get(key).isEmpty()) {
                result.add(byAvg.get(key));
            }
        }

        return result;
    }

    // range 0..9
    private void groupByRange(int range, List<Mokinys> prData, Map<String, List<Mokinys>> byAvg) {
        List<Mokinys> listForRemove = new ArrayList<>();

        List<Mokinys> list = null;

        for (Mokinys mokinys : prData) {
            if (mokinys.getVidurkis() < (range + 1)) {
                // Isisitraukiam Value (List<>)
                list = byAvg.get(Integer.toString(range));
                // list = byAvg.get("" + range);

                // Prie Map value pridedam Mokinys tipo objekta
                list.add(mokinys);
                // "Isimenam" ka reiks pasalinti is pradiniu duomenu
                listForRemove.add(mokinys);
            }
        }
        // Jau atrinkuom juos - ismetam, nebenus reikalingi
        prData.removeAll(listForRemove);
    }

    private Map<String, List<Mokinys>> initMapByAvg() {
        Map<String, List<Mokinys>> result = new HashMap<>();

        for (int i = 0; i < REZIAI; i++) {
            result.put("" + i, new LinkedList<>());
        }

        return result;
    }

    private List<Mokinys> fetchData(Map<String, List<Mokinys>> mokiniai) {

        Collection<List<Mokinys>> list = mokiniai.values();
        List<Mokinys> result = new ArrayList<>();

        for (List<Mokinys> elementList : list) {
            result.addAll(elementList);
        }

        return result;
    }
}
