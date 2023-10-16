package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session= sessionFactory.getCurrentSession();
        session.beginTransaction();
        //List<Employee> employeeList = session.createQuery("from Employee").getResultList();
        //for (Employee e : employeeList)
        //    System.out.println(e);

        List employeeList1 = session.createQuery("from Employee " + "where name = 'Andy' AND salary>400").getResultList();
        for (Object e : employeeList1)
            System.out.println(e);

        session.getTransaction().commit();

    }
}
