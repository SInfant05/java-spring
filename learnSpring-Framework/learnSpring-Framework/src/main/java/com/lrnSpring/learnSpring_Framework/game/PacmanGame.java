package com.lrnSpring.learnSpring_Framework.game;

public class PacmanGame implements GameConsole {
    public String toString() {
        return "Pacman Game";
    }
    public void up() {
        System.out.println("Pacman Move Forward");
    }
    public void down() {
        System.out.println("Pacman Move Down");
    }
    public void right() {
        System.out.println("Pacman Move Right");
    }
    public void left() {
        System.out.println("Pacman Move Left");
    }

}
