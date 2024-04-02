package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class IO4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("_02code\\src\\IO\\aaa.txt");
        int b ;
        while( (b= fis.read() )!=-1 ){
            System.out.print((char)b);
        }
    }
}
