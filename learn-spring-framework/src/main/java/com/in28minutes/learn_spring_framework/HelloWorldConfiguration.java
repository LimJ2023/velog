package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//게터 세터 자동 생성해줌
record Person (String name, int age, Address address){};
record Address (String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return"name객체관리";
    }
    @Bean
    public int age(){
        return 20;
    }

    //사용자 지정 클래스도 객체로 관리할 수 있을까?
    @Bean
    public Person person() {
        return new Person("임재",30,new Address("이문로25길","서울시"));
    }
    
    //메소드를 호출하여 빈 전달
    @Bean
    public Person person2MethodCall() {
        return new Person(name(),age(),address());
    }
    //파라미터를 통해 호출
    @Bean
    public Person person3Parameters(String name, int age, Address address2) { //
        return new Person(name,age,address2);
    }

    //이 메소드의 함수명을 바꾸지 않고 빈의 이름을 바꾸는 방법은 없을까?
    // 이 방법으로 이름을 바꾸면 예전 함수명으론 검색이 되지 않음.
    @Bean(name = "YourCustomBean")
    public Address address() {
        return new Address("동대문구","서울");
    }
}
