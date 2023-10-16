package aop.aspect;

import aop.aspect.Library;
import aop.aspect.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c1 = new AnnotationConfigApplicationContext(MyConfig.class);
        Library l1 = c1.getBean("library", Library.class);
        l1.getBook();
        c1.close();
    }
}
