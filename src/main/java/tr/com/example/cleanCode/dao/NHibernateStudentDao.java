package tr.com.example.cleanCode.dao;

import tr.com.example.cleanCode.model.Person;

public class NHibernateStudentDao implements IStudentDao {
    public void saveStudent(Person student) {
        System.out.println("Nhibernate student save edildi.");
    }
}
