package hibernate_one_to_one;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Employee employee = new Employee("Nina","Johnson","IT",700);
        Detail detail = new Detail("Berlin", "85637887", " hdht@hfh.gr");
        employee.getEmpDetail(detail);
        session.beginTransaction();
        session.save(employee);



        session.getTransaction().commit();
    }
}
