package com.lrnSpring.learnSpring_Framework.game;

import org.springframework.stereotype.Component;

@Component

public class GameRunner {
    GameConsole game;

    public GameRunner(GameConsole mariogame) {
        this.game = mariogame;
    }

        public void run() {
            System.out.println(" Running Game :" + this.game.toString());
            this.game.up();
            this.game.down();
            this.game.right();
            this.game.left();
        }
    }

