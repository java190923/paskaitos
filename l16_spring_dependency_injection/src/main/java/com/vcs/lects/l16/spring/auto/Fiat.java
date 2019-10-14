package com.vcs.lects.l16.spring.auto;


import org.springframework.stereotype.Component;

@Component
public class Fiat implements Car {

    @Override
    public void uzvesti() {
        System.out.println("zig zig zig.... zig zigggg... zig.. bgummmm bum bum");
    }
}
