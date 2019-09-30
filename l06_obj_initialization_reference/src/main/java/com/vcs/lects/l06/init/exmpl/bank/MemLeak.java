package com.vcs.lects.l06.init.exmpl.bank;

public class MemLeak {

    private MemLeak ml;
    private byte[] buffer;

    public static void main(String[] args) {
        // Eat the heap
        MemLeak memParent = new MemLeak();
        while (true) {
            MemLeak mem = new MemLeak();
            mem.buffer = new byte[5000000];
            mem.ml = memParent;
            memParent = mem;
        }
    }
}

