package task2;

public class Main {
    public static void main(String []args){
        Teacher p1 = new Teacher("张三",25,"计算机部");
        Student p2 = new Student("李四",18,"一班");
        System.out.println(p1.getName()+" "+ p1.getAge()+" "+p1.getDepartment());
        p1.checkClass();
        p1.publishForm();
        System.out.println(p2.getName()+" "+p2.getAge()+" "+p2.getClassstudent());
        p2.checkClass();
        p2.fillForm();

    }
}
