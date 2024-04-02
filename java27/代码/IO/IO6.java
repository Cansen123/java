package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class IO6 {
    public static void main(String[]args) throws IOException {
        FileInputStream fis = new FileInputStream("_02code\\src\\IO\\aaa.txt");
        byte [] bytes = new byte[2];
        int len;
        while((len= fis.read(bytes) )!= -1){
            System.out.print(new String(bytes,0,len));
        }
        fis.close();
    }
}
