package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class solution2 {
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length()==3;
            }
        }).forEach(s-> System.out.println(s));
        System.out.println("-----------------------------------------------------------");
        list.stream().filter(new Operation() :: pan).forEach(s-> System.out.println(s));
        System.out.println("-----------------------------------------------------------");
        solution2 tt = new solution2();
        list.stream().filter(tt :: pan).forEach(s-> System.out.println(s));


    }
    public boolean pan (String s){
        return s.length()==3 && s.startsWith("张");
    }
}
