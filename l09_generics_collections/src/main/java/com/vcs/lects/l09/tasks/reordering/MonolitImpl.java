package com.vcs.lects.l09.tasks.reordering;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MonolitImpl implements IReordering {
    @Override
    public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {
        int kiekisReziu = 10;
        List<List<Mokinys>> result = new ArrayList<>();
        for (int vidurkis = 0; vidurkis < kiekisReziu; vidurkis++) {
            result.add(vidurkis, new ArrayList<>());
            for (List<Mokinys> list : mokiniai.values()) {
                for (Mokinys mokinys : list) {
                    if (mokinys.getVidurkis() >= vidurkis && mokinys.getVidurkis() < vidurkis + 1
                            || mokinys.getVidurkis() == kiekisReziu && vidurkis == kiekisReziu - 1) {
                        result.get(vidurkis).add(mokinys);
                    }
                }
            }
        }
        return result;
    }
}
