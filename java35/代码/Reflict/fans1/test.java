package Reflict.fans1;

public class test {
    public static void main(String[]args) throws ClassNotFoundException {
        Class clazz1 = Class.forName("Reflict.fans1.Student");
        System.out.println(clazz1);
        Class clazz2 = Student.class;
        System.out.println(clazz2);
        Student stu = new Student();
        System.out.println(stu.getClass());
    }
}
