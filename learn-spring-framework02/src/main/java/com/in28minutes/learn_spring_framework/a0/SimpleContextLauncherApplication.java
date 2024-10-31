package com.in28minutes.learn_spring_framework.a1;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//컴포넌트를 검색할 곳을 알려줘야 할때는 어떻게 할까?
@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {

 public static void main(String[] args) {

     var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);

    }
}
