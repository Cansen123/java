package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class solution1 {
    public static void main(String []args){
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"1","2","3","4","5","6","7","8","9","10");
        List<Integer> list2 = list1.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(list2);
    }
}
