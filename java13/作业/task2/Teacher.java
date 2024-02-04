package task2;

public class Teacher extends Character{
    private String department;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public Teacher(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void publishForm(){
        System.out.println("发布问题");
    }
}
