package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GamingConsole;

public class GameRunner {
    //MarioGame 타입의 game을 전부 SuperContra 타입으로 바꿔주는게 옳을까?
    //MarioGame game;
    //인터페이스인 GamingConsloe 타입으로 바꿔준다.
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void run() {
        System.out.println("Running game: "+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
