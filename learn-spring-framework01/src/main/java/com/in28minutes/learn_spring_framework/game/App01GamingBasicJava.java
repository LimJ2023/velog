package com.in28minutes.learn_spring_framework.game;

public class App01GamingBasicJava {
     public static void main(String[] args) {
         // 현재 강한 커플링 상태 커플링 : 무언가를 변경하는데 얼마나 많은 작업이 관련되어 있는지에 대한 측정.
        var game1 = new BlueArchive();
        var game2 = new Nike();

         var gameRunner = new GameRunner(game1);
         gameRunner.run();
         // Game is a Dependency of GameRunner.
         // Game에 의존성을 주입 하려면 어떻게 해야할까...
         // 현재는 개발자가 의존성을 주입하고 있다. (어떤 게임을 주입하냐에 따라 달라짐)
         // 대신 스프링이 의존성을 관리하게 하면 어떨까? 객체를 관리하게 시키는 방법이 뭘까? <-- Spring bean
    }
}
