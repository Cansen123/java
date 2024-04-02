package IO;

import java.io.FileReader;
import java.io.IOException;

public class IO10 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("_02code\\src\\IO\\aaa.txt");
        int t ;
        while((t = fr.read()) != -1){
            System.out.print((char)t);
        }
        fr.close();
    }
}
