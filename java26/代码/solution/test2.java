package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test2 {
    public static void main(String[]agrs){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",20));
        list.add(new Student("李四",21));
        list.add(new Student("王五",22));
        list.add(new Student("赵六",23));

        String [] name = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(name));

    }
}
