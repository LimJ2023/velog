package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
     public static void main(String[] args) {
        //Spring context로 객체를 관리하기
         // 1. Launch a Spring context -
         var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
         // Configure the things that we want Spring to manage
         // HelloWorldConfiguration - <- @Configuration
         // name - @Bean

         //메소드 이름으로 빈을 불러오기 (Spring에서 관리중인)
         System.out.println(context.getBean("name"));
         System.out.println(context.getBean("age"));
         System.out.println(context.getBean("person"));
         System.out.println(context.getBean("YourCustomBean"));
         //이름 대신 클래스를 가져올 수도 있다.
         System.out.println(context.getBean(Address.class));
//         System.out.println(context.getBean("person2MethodCall"));
         
         //기존의 빈들을 이용하여 만든 객체
         System.out.println(context.getBean("person3Parameters"));


    }
}
