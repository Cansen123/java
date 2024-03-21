package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test3 {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list , new Student("张三",22),new Student("李四",23),new Student("王五",24)
        , new Student("赵六",26));
        String[] str = list.stream().map(Student::putTwoMessage).toArray(String[]::new);
        System.out.println(Arrays.toString(str));
    }
}
