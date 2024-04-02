package IO;

import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;

public class IO9 {
    public static void main(String[]args) throws UnsupportedEncodingException {

        String str = "0721起爆器aiaia";
        byte[] bytes = str.getBytes();

        System.out.println(new String(bytes));
        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(new String(bytes1,"GBK"));
    }
}
