package tr.com.example.badCode.dao;

import tr.com.example.badCode.enums.DatabaseTypeEnum;
import tr.com.example.badCode.model.Person;

public class StudentDao {

    private DatabaseTypeEnum databaseTypeEnum;

    public StudentDao(DatabaseTypeEnum databaseTypeEnum) {
        this.databaseTypeEnum = databaseTypeEnum;
    }

    public void saveStudent(Person person) {
        if(databaseTypeEnum.equals(DatabaseTypeEnum.SqlServer)) {
            System.out.println("SqlServer'a Person kaydedildi.");
        }
        else if(databaseTypeEnum.equals(DatabaseTypeEnum.Oracle)) {
            System.out.println("Oracle'a Person kaydedildi.");
        }
    }
}
