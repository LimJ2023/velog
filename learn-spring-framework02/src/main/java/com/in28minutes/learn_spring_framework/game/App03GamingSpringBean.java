package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

    //컴포넌트를 검색할 곳을 알려줘야 할때는 어떻게 할까?
@Configuration
@ComponentScan("com/in28minutes/learn_spring_framework/game")
public class App03GamingSpringBean {

     public static void main(String[] args) {

         var context = new AnnotationConfigApplicationContext(App03GamingSpringBean.class);

         context.getBean(GamingConsole.class).up();
         context.getBean(GameRunner.class).run();
    }
}
