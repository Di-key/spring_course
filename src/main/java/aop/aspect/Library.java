package aop.aspect;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook() {
        System.out.println("I get book");
    }
}
