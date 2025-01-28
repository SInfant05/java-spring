package com.lrnSpring.learnSpring_Framework.game;

import org.springframework.stereotype.Component;


public class SuperContra implements GameConsole {
    public String toString() {
        return "SuperContra Game";
    }
    public void up() {
        System.out.println("UP");
    }
    public void down() {
        System.out.println("Down");
    }
    public void right() {
        System.out.println("Right");
    }
    public void left() {
        System.out.println("Left");
    }

}
