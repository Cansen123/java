package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class OI2 {
    public static void main(String[] argsS) throws IOException {
        FileOutputStream fos =  new FileOutputStream("_02code\\src\\IO\\aaa.txt");
        //fos.write(97);
        //fos.write(98);
        byte[] byt = {97,98,99,100,101};
        fos.write(byt,0,3);
        fos.close();

    }
}
