package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class solution3 {
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");
        List<Student> newList =  list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList);
    }
}
