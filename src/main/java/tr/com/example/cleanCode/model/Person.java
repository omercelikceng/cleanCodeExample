package tr.com.example.cleanCode.model;

public class Person {
    private String tcNo;
    private String name;
    private String surname;

    public Person() {
    }

    public Person(String tcNo, String name, String surname) {
        this.tcNo = tcNo;
        this.name = name;
        this.surname = surname;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
