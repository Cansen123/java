package IO.中核;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
    public static void main(String[]args) throws IOException {
        Properties pt = new Properties();
        /*FileOutputStream fos = new FileOutputStream("D:\\java\\新建文件夹\\p.txt");
        pt.put("aaa","bb");
        pt.put("bbb","cc");
        pt.put("ccc","dd");
        pt.put("ddd","ee");
        pt.store(fos,"test");
        fos.close();*/
        FileInputStream fis = new FileInputStream("D:\\java\\新建文件夹\\p.txt");
        pt.load(fis);
        System.out.println(pt);
    }
}
