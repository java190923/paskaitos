package com.vcs.lects.l09.vehicle.varikliai;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author owr
 */
public class TDI implements VidausDegimo {

    @Override
    public void pripiltiKuro() {
        System.out.println("Pilam TDI");
    }
    
     @Override
    public void patiklintiTepala(String tepalas) {
        System.out.println("tikrinam tepala dyzeliniams");
    }

}
