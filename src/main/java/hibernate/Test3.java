package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session= sessionFactory.getCurrentSession();
        session.beginTransaction();
       Employee employee = session.get(Employee.class, 1);
       employee.setName("Robert");
       employee.setSalary(550);

        session.getTransaction().commit();

    }
}
