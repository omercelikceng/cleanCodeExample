package tr.com.example.badCode;

import tr.com.example.badCode.model.Person;
import tr.com.example.badCode.model.Student;
import tr.com.example.badCode.service.StudentService;

public class Main {
    public static void main(String[] args) {
        Person person = new Student();
        person.setName("Omer");
        person.setSurname("Celik");
        StudentService studentService = new StudentService();
        studentService.saveStudent(person);
    }
}
