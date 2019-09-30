package com.vcs.lects.l06.init.exmpl.bank;

public class Bank {

    public static void main(String[] args) {


        TicketMachine m1 = new TicketMachine();
        TicketMachine m2 = new TicketMachine();
        TicketMachine m3 = new TicketMachine();


        System.out.println(m1.pushTheButton().getNr());
        System.out.println(m2.pushTheButton().getNr());
        System.out.println(m1.pushTheButton().getNr());
        System.out.println(m3.pushTheButton().getNr());
        System.out.println(m1.pushTheButton().getNr());
        System.out.println(m2.pushTheButton().getNr());
        System.out.println(m2.pushTheButton().getNr());


    }

}
