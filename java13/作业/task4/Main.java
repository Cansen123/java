package task4;

public class Main {
    public static void main(String[]args){
        Student p1 = new Student("张三",'男',18,"中国","清华大学","001");
        StudentLeader p2 = new StudentLeader("李四",'男',18,"中国","清华大学","002","学生会主席");
        Worker p3 = new Worker("王五",'男',40,"中国","清华大学",20);
        p1.work();
        p3.work();
        p2.meeting();
    }
}
