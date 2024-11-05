package com.in28minutes.learn_spring_framework.game;

    //MarioGame 타입의 game을 전부 SuperContra 타입으로 바꿔주는게 옳을까?
    //MarioGame game;
    //인터페이스인 GamingConsloe 타입으로 바꿔준다.
//    Nike game2;
public class GameRunner {
    MobileConsole game;

    public GameRunner(MobileConsole game) {
        this.game = game;
    }
    public void run() {
        System.out.println("게임 실행 : "+ game);
        game.gacha();
        game.autoPlay();
    }
}
