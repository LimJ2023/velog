package com.in28minutes.learn_spring_framework.e0;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class  NormalClass {
}


@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
    //일반 클래스와 프로토타입 클래스의 차이

}
@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {

     public static void main(String[] args) {

         var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class);
         System.out.println(context.getBean(NormalClass.class));
         System.out.println(context.getBean(NormalClass.class));

         //호출할 때마다 다른 해시코드 값이 나옴. 왜일까?
         // 모든 Spring Bean은 싱글톤임. 다른 인스턴스를 생성시키고 싶을 땐 프로토 타입을 사용.
         //java 싱글톤>> <-- GOF.  spring 싱글톤??? <-- IOC container에 하나의 객체. java는 JVM전체
         System.out.println(context.getBean(PrototypeClass.class));
         System.out.println(context.getBean(PrototypeClass.class));
         System.out.println(context.getBean(PrototypeClass.class));

         //Bean 호출시 먼저 불러오기 나중에 불러오기
         // @PostConstruct, @PreDestroy


     }
}
