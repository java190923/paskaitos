/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l07.tostring;

/**
 *
 * @author owr
 */
public class ToString {
    
    private int sk = 99;
    private String txt = "Tekstukas";
    
    
    public static void main(String[] args) {
        
        ToString tostr = new ToString();
        
        System.out.println(tostr);
        
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " sk=" + sk + " txt=" + txt;
    }
    
    
}
