package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader fsr = new InputStreamReader(new FileInputStream("D:\\java\\code\\_01code\\_02code\\src\\IO\\ddd.txt"),"GBK");
        BufferedReader br = new BufferedReader(fsr);
        String ch ;
        while((ch= br.readLine())!=null){
            System.out.println(ch);
        }
        br.close();
    }
}
