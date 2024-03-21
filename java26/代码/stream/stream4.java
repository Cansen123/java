package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class stream4 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");
        List<String> tt = list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(tt);
        System.out.println("----------------------------------------------------------------");
        Set<String> set = list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set);
        System.out.println("-----------------------------------------------------------------");
        Map<String,Integer> mp = list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[2]);
            }
        }));
        System.out.println(mp);
        System.out.println("---------------------------------------------------------------------");
        Map<String,Integer> map = list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toMap(s->s.split("-")[0],s->Integer.parseInt(s.split("-")[2])));
        System.out.println(map);
    }
}
