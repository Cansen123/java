package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("_02code\\src\\IO\\aaa.txt",true);

        String str = "Hello World\r\n";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        String str2  = "so os li";
        byte[] ff = str2.getBytes();
        fos.write(ff);
        fos.close();
    }
}
