/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vcs.lects.l07.relations;

/**
 *
 * @author owr
 */
public class relations {
    
}

class Zmogus {
    private Suo[] sunys;
    private Pilietybe[] pilietybes;
    private Plaukai plaukai;
}

class Suauges extends Zmogus{}

class Moteris extends Suauges{}
class Vyras extends Suauges{}

class Motina extends Moteris{
    private Vaikas[] vaikai;
}
class Tevas extends  Vyras{
    private Vaikas[] vaikai;
}

class Vaikas  extends Zmogus{
    private Motina motina;
    private Tevas tevas;
}

class Suo {
    private Plaukai plaukai;
    private Zmogus[] seimininkai;
}
class Pilietybe {}
class Plaukai {}