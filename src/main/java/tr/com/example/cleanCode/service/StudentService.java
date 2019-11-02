package tr.com.example.cleanCode.service;

import tr.com.example.cleanCode.dao.IStudentDao;
import tr.com.example.cleanCode.model.Person;

public class StudentService {

    private IStudentDao iStudentDao;

    public StudentService(IStudentDao iStudentDao) {
        this.iStudentDao = iStudentDao;
    }

    public void saveStudent(Person person) {
        iStudentDao.saveStudent(person);
    }
}
