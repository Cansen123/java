package IO.中核;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class test22 {
    public static void main(String[] args) throws IOException {
        //1.输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\Java基础-资料\\day30-阶段综合案例（带权重的随机&每日一记）\\代码\\myiotest\\names.txt"));
        //2.读取数据
        ArrayList<String> boy = new ArrayList<>();
        ArrayList<String> girl = new ArrayList<>();
        String str ;
        while((str=br.readLine())!=null){
            String[] arr = str.split("-");
            if(arr[1].equals("男")){
                boy.add(arr[0]);
            }else{
                girl.add(arr[0]);
            }
        }
        System.out.println(boy);
        System.out.println(girl);
        //3.点名并统计数据
        int boycount =0 , girlcount =0;
        Random r = new Random();
        for(int i=0;i<10000000;i++){
            int gob = r.nextInt(10);
            if(gob>2){
                int index = r.nextInt(girl.size());
                System.out.println(girl.get(index));
                girlcount++;
            }else{
                int index = r.nextInt(boy.size());
                System.out.println(boy.get(index));
                boycount++;
            }
        }
        System.out.println(boycount);
        System.out.println(girlcount);

    }
}
