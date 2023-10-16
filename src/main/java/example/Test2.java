package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = c1.getBean("MyPet", Pet.class);
        pet.say();

        c1.close();
    }
}
