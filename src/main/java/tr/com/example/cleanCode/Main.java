package tr.com.example.cleanCode;

import tr.com.example.cleanCode.dao.NHibernateStudentDao;
import tr.com.example.cleanCode.model.Person;
import tr.com.example.cleanCode.model.Student;
import tr.com.example.cleanCode.service.StudentService;

public class Main {
    public static void main(String[] args) {
        Person person = new Student();
        person.setName("Omer");
        person.setSurname("Celik");
        StudentService studentService = new StudentService(new NHibernateStudentDao());
        studentService.saveStudent(person);
    }
}
