package hibernate_one_to_many;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            Department department = new Department("IT", 1200,600);
            Employee employee = new Employee("Nina","Johnson",700);
            Employee employee1 = new Employee("John", "Dow",750);
            department.addEmployee(employee);
            department.addEmployee(employee1);
            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
        }
        finally {
            session.close();
            sessionFactory.close();
        }





    }
}
