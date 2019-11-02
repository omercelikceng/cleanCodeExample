package tr.com.example.badCode.model;

public class Student extends Person {
    private String studentNo;
    private String schoolName;

    public Student() {
    }

    public Student(String studentNo, String schoolName) {
        this.studentNo = studentNo;
        this.schoolName = schoolName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
