package IO.中核;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class test23 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\Java基础-资料\\day30-阶段综合案例（带权重的随机&每日一记）\\代码\\myiotest\\names.txt"));
        ArrayList<String> list = new ArrayList<>();
        String str;
        while((str = br.readLine())!=null){
            list.add(str.split("-")[0]);
        }
        Random r = new Random();
        for(int i=0;i<100;i++)
        {
            int index = r.nextInt(list.size());
            if(i==2){
                System.out.println("张三");
                continue;
            }
            System.out.println(list.get(index));
        }

    }
}
