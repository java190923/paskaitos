package com.vcs.lects.l06.init.exmpl.bank;

public class TicketMachine {

    private static int nr = 1;

    public Ticket pushTheButton() {
        return new Ticket(nr++);
    }



}
