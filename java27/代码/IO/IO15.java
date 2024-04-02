package IO;

import java.io.*;

public class IO15 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("_02code\\src\\IO\\ddd.txt"));
        BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("D:\\java\\code\\_01code\\_02code\\src\\IO\\copy.txt"));
        int t ;
        while((t=bis.read())!=-1){
            bos.write(t);
        }
        bos.close(); bis.close();
    }
}
