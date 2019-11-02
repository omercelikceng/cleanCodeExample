package tr.com.example.badCode.service;

import tr.com.example.badCode.dao.StudentDao;
import tr.com.example.badCode.enums.DatabaseTypeEnum;
import tr.com.example.badCode.model.Person;

public class StudentService {

    public void saveStudent(Person person) {
        StudentDao studentDao = new StudentDao(DatabaseTypeEnum.SqlServer);
        studentDao.saveStudent(person);
    }
}
