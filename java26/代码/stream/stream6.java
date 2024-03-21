package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class stream6 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23","lisi,24","wangwu,25");
        Map<String,Integer> map = list.stream().filter(s->24<=Integer.parseInt(s.split(",")[1])).collect(Collectors.toMap(s->s.split(",")[0],s->Integer.parseInt(s.split(",")[1])));
        System.out.println(map);
    }
}
