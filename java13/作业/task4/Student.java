package task4;

public class Student extends Person{
    private String school ;
    private String stuNumber;

    public Student(String school, String stuNumber) {
        this.school = school;
        this.stuNumber = stuNumber;
    }

    public Student(String name, char gender, int age, String nationality, String school, String stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学生需要学习!");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }
}
