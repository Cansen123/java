package Next;
import java.util.*;
import java.util.function.BiConsumer;


public class Test1 {
    public static void main(String[]args){
        List<String> list = List.of("张三","李四","王五","赵六");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------------------------------------");

        Set<String> set = Set.of("张三","李四","王五","赵六");
        for(String s: set){
            System.out.println(s);
        }
        System.out.println("-----------------------------------------------");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("-------------------------------------------------");
        Map<String,String> mp = Map.of("张三","广州","李四","上海","王五","北京","赵六","美国");
        Set<Map.Entry<String,String>> hm = mp.entrySet();
        for (Map.Entry<String, String> tt : hm) {
            String a = tt.getKey();
            String b = tt.getValue();
            System.out.println(a + " "+ b);
        }
        System.out.println("------------------------------------------------");
        HashMap<String,String> hm0 = new HashMap<>();
        hm0.put("张三","广州");
        hm0.put("李四","上海");
        hm0.put("王五","北京");
        hm0.put("赵六","美国");
        Map<String,String> mpt = Map.ofEntries(hm0.entrySet().toArray(new Map.Entry[0]));
        mpt.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " " + s2);
            }
        });
        System.out.println("-------------------44-----------------------------------");
        Map<String,String> s = Map.copyOf(hm0);
        s.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s+ " " + s2);
            }
        });

    }
}
