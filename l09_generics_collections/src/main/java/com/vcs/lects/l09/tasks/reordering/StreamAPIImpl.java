package com.vcs.lects.l09.tasks.reordering;

import static java.util.Comparator.comparing;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class StreamAPIImpl implements IReordering {
    @Override
    public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {


        return new ArrayList<>(mokiniai
                .values()
                .stream()
                .flatMap(List::stream)
                .sorted(comparing(Mokinys::getVidurkis))
                .collect(Collectors.groupingBy(m -> "" + (int)(m.getVidurkis() > 9 ? 9.0 : m.getVidurkis())))
                .values());
    }

}
