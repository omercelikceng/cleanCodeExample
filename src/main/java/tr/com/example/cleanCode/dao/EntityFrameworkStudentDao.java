package tr.com.example.cleanCode.dao;

import tr.com.example.cleanCode.model.Person;

public class EntityFrameworkStudentDao implements IStudentDao {
    public void saveStudent(Person student) {
        System.out.println("EntityFramework student save edildi.");
    }
}
