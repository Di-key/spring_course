package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c4 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dog dog = c4.getBean("MyPet", Dog.class);
        dog.say();
        c4.close();
    }
}
