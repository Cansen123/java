package IO;

import java.io.*;

public class IO16 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("_02code\\src\\IO\\aaa.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("_02code\\src\\IO\\copy.txt"));
        byte[] bytes = new byte[1024];
        int len ;
        while((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close() ; bis.close();
    }
}
