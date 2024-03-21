package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class stream1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa","bbb","ccc","ddd","eee","fff");
        list.stream().forEach(s-> System.out.println(s));
        System.out.println("------------------------------------");
        HashMap<String ,Integer> hm = new HashMap<>();
        hm.put("aaa",1);
        hm.put("bbb",2);
        hm.put("ccc",3);
        hm.put("ddd",4);
        Set<String> set = hm.keySet();
        set.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                int i = hm.get(s);
                System.out.println(s+" = " + i);
            }
        });
        System.out.println("----------------------------------------");
        Set<Map.Entry<String,Integer>> it = hm.entrySet();
        Stream<Map.Entry<String,Integer>> p = it.stream();
        p.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------------");
        hm.keySet().stream().forEach(s-> System.out.println(s));
        System.out.println("------------------------------------------");
        hm.entrySet().stream().forEach(s-> System.out.println(s));
        System.out.println("--------------------------------------------");
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).forEach(s-> System.out.println(s));
        System.out.println("-----------------------------------------------");
        Stream.of("aaa","bbb","ccc","ddd").forEach(s-> System.out.println(s));
    }
}
