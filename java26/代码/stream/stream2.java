package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class stream2 {
    public static void main(String[]agrs){
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰-61");
        list.add("张无忌-13");
        list.add("张翠山-40");
        list.add("王二麻子-50");
        list.add("张良-20");
        list.add("谢广坤-88");

        list.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));
        System.out.println("----------------------------------------------");
        list.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println("-----------------------------------------------");
        list.stream().skip(3).forEach(s-> System.out.println(s));
        System.out.println("-----------------------------------------------");
        list.stream().distinct().forEach(s-> System.out.println(s));
        System.out.println("------------------------------------------------");
        Stream.concat(list.stream().limit(3),list.stream().skip(5)).forEach(s-> System.out.println(s));
        System.out.println("-------------------------------------------------");
        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
    }
}
