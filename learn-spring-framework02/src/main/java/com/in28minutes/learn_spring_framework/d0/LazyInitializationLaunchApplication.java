package com.in28minutes.learn_spring_framework.d0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}
@Component
@Lazy
class ClassB{
    private ClassA classA;
    public ClassB(ClassA classA) {
        //Logic
        System.out.println("Some Initialization logic");
        this.classA = classA;
    }
    public void DoSomething() {
        System.out.println("Do Something~");
    }
}
@Configuration
@ComponentScan
public class LazyInitializationLaunchApplication {

 public static void main(String[] args) {

     var context = new AnnotationConfigApplicationContext(LazyInitializationLaunchApplication.class);
//    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

     context.getBean(ClassB.class).DoSomething();
    }
}
