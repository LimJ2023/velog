package com.in28minutes.learn_spring_framework.game;

public class Nike implements MobileConsole{
    @Override
    public void gacha() {
        System.out.println("니케를 뽑았습니다. 결과는 필그림이었습니다!");
    }

    @Override
    public void autoPlay() {
    System.out.println("자동 전투를 실행합니다.");
    }
}
