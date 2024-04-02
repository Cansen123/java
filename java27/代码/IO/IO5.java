package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\86137\\Documents\\Tencent Files\\1623888041\\Video\\98C8D64A5BE968536CC5A69A785D8815.png");
        FileOutputStream fos = new FileOutputStream("_02code\\jj.png");
        int b ;
        long t = System.currentTimeMillis();
        while((b= fis.read())!= -1){
            fos.write(b);
        }
        fos.close();
        fis.close();
        long s = System.currentTimeMillis();
        System.out.println(s-t);
    }
}
