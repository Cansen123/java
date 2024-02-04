package task2;

public class Student extends Character{
    private String Classstudent;

    public Student(String name, int age, String classstudent) {
        super(name, age);
        Classstudent = classstudent;
    }

    public Student(String classstudent) {
        Classstudent = classstudent;
    }
    public void fillForm(){
        System.out.println("填写听课反馈");
    }

    public String getClassstudent() {
        return Classstudent;
    }

    public void setClassstudent(String classstudent) {
        Classstudent = classstudent;
    }
}
