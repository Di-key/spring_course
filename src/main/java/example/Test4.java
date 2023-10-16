package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c3 = new ClassPathXmlApplicationContext("applicationContext.xml",
                "applicationContext2.xml");



    }
}
