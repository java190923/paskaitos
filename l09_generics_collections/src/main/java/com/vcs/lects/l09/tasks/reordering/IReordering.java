package com.vcs.lects.l09.tasks.reordering;

import java.util.List;
import java.util.Map;

public interface IReordering {

    /**
     * @param mokiniai - isrikiuoti pagal vardus
     * @return turetu grazinti isrikiuotus pagal pazymiu vidurki reziais
     */
    public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai);
}

