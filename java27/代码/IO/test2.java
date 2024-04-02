package IO;

import java.io.*;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\code\\_01code\\_02code\\src\\IO\\ppp.txt") );

        String arr = br.readLine();
        int count = Integer.parseInt(arr);
        count++;
        if(count <=3){
            System.out.println("欢迎使用本软件，第"+ count+"次使用免费使用");
        }else{
            System.out.println("本软件只能免费使用3次，欢迎注册会员后再使用");
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\code\\_01code\\_02code\\src\\IO\\ppp.txt"));
        bw.write(count+"");
        bw.close();
    }
}
