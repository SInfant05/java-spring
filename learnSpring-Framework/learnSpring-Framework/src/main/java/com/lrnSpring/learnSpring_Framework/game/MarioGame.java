package com.lrnSpring.learnSpring_Framework.game;

public class MarioGame implements GameConsole {
    public String toString() {
        return "Mario Game";
    }
    public void up() {
        System.out.println("Move Forward");
    }
    public void down() {
        System.out.println("Move Down");
    }
    public void right() {
        System.out.println("Move Right");
    }
    public void left() {
        System.out.println("Move Back");
    }

}
