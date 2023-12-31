package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
       SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
               .addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
       // Employee employee = new Employee("Mary", "V", "Sales", 300);
       // session.beginTransaction();
       // session.save(employee);
        //session.getTransaction().commit();

        //int myId = employee.getId();
        session= sessionFactory.getCurrentSession();
        session.beginTransaction();
        Employee employee1 = session.get(Employee.class, 3);
        session.getTransaction().commit();
        System.out.println(employee1);
    }

}
