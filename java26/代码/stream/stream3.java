package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class stream3 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        list.stream().forEach(s-> System.out.println(s));
        System.out.println("-------------------------------");
        long t = list.stream().count();
        System.out.println(t);
        System.out.println("---------------------------------");
        Object[] it = list.stream().toArray();
        System.out.println(Arrays.toString(it));
        System.out.println("---------------------------------");
        String [] arr = list.stream().toArray(value-> new String[value]);
        System.out.println(Arrays.toString(arr));

    }
}
