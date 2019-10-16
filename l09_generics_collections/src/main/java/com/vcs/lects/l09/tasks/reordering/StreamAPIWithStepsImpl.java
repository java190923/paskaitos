package com.vcs.lects.l09.tasks.reordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LiambdasWithStepsImpl implements IReordering {
    @Override
    public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {

        // Convert to single list
        List<Mokinys> mok = mokiniai.values().stream().collect(ArrayList::new, (cist, m) -> cist.addAll(m),
                (l1, l2) -> l1.addAll(l2));

        // Sort
        mok.sort((m1, m2) -> Double.compare(m1.getVidurkis(), m2.getVidurkis()));

        // Mapping items by average
        Map<String, List<Mokinys>> orderedMap = mok.stream()
                .collect(Collectors.groupingBy((m) -> "" + ((int) m.getVidurkis() == 10 ? 9 : (int) m.getVidurkis())));

        // Map values to lists
        return new ArrayList<>(orderedMap.values());
    }
}
