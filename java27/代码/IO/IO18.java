package IO;

import java.io.*;
import java.nio.charset.Charset;

public class IO18 {
    public static void main(String[] args) throws IOException {
      //  InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\java\\Java基础-资料\\day29-IO（其他流）\\资料\\cstb.txt"),"GBK");

        //int ch ;
        /*while((ch = isr.read())!=-1){
            System.out.print((char)ch);
        }
        isr.close();
        */
      /*  FileReader br = new FileReader("D:\\java\\Java基础-资料\\day29-IO（其他流）\\资料\\ff.txt", Charset.forName("GBK"));
        int t ;
        while((t=br.read())!=-1){
            System.out.println((char)t);
        }

        br.close();*/

        FileReader fr = new FileReader("D:\\java\\Java基础-资料\\day29-IO（其他流）\\资料\\csb.txt");
        FileWriter fw = new FileWriter("D:\\java\\code\\_01code\\_02code\\src\\IO\\ddd.txt",Charset.forName("gb18030"));
        int t ;
        while((t=fr.read())!=-1){
            fw.write(t);
        }
        fw.close() ; fr.close();

    }
}
