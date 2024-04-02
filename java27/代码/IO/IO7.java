package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\86137\\Documents\\Tencent Files\\1623888041\\Video\\98C8D64A5BE968536CC5A69A785D8815.png");
        FileOutputStream fous = new FileOutputStream("_02code\\copy.png");
        byte [] bytes = new byte[1024*5];
        long time = System.currentTimeMillis();
        int len ;
        while((len = fis.read())!= -1){
            fous.write(bytes,0,len);
        }
        fous.close();
        fis.close();
        long tt = System.currentTimeMillis();
        System.out.println(tt-time);
    }
}
