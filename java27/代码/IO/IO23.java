package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IO23 {
    public static void main(String[]args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\java\\code\\_01code\\_02code\\src\\IO\\aaa.txt"),true);
        pw.println("憨态，八嘎，无路赛");
        pw.close();
    }
}
