package task2;
import java.util.ArrayList;
public class task2 {
    public static void main(String[]args){
        ArrayList<Teacher> list = new ArrayList<Teacher>();
        Teacher p1 = new Teacher("赵老师","javase");
        Teacher p2 = new Teacher("钱老师","javase");
        Teacher p3 = new Teacher("孙老师","php");
        Teacher p4 = new Teacher("李老师","python");

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名: "+list.get(i).getName()+", 专业: "+list.get(i).getSubject());
        }
    }
}
