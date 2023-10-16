package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = c2.getBean("MyPet", Pet.class);
        Person p1= new Person(pet);
        p1.callPet();

    }
}
