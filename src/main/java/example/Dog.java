package example;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements Pet {
   @Override
    public void say() {
       System.out.println("Bow-wow");
    }

    public Dog() {
        System.out.println("Dog bean is insert");
    }

    @PostConstruct
    public void init() {
        System.out.println("Dog - init");
    }
@PreDestroy
    public void destroy() {
        System.out.println("Dog - destroy");
    }
}


