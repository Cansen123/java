package IO.中核;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\Java基础-资料\\day30-阶段综合案例（带权重的随机&每日一记）\\代码\\myiotest\\names.txt"));
        ArrayList<String> list = new ArrayList<>();
        String str;
        while((str = br.readLine())!=null){
            list.add(str.split("-")[0]);
        }
        Random r = new Random();
        ArrayList<String> copy= new ArrayList<>();
        copy.addAll(list);

       // System.out.println(copy);
        for(int i=0;i<10;i++){
            Collections.shuffle(list);
            System.out.println("----------"+(i+1)+"----------------------");
            while(list.size()!=0){
                int index = r.nextInt(list.size());
                System.out.println(list.get(index));
                list.remove(index);
            }
            list.addAll(copy);

        }
    }
}
