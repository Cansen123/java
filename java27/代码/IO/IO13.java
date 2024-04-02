package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO13 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\java\\新建文件夹\\copy.png");
        FileOutputStream fos = new FileOutputStream("D:\\java\\新建文件夹\\copyt.png");
        int read  ;
        while((read = fis.read())!=-1){
            fos.write(read ^ 3);
        }
        fos.close() ; fis.close();
    }
}
