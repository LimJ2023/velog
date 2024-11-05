package com.in28minutes.learn_spring_framework.game;

public class BlueArchive implements MobileConsole{
    @Override
    public void gacha() {
        System.out.println("당신은 뽑기를 했습니다! 결과는 1성이었습니다.");
    }

    @Override
    public void autoPlay() {
    System.out.println("블루 아카이브 자동 전투를 진행 합니다.");
    }
}
