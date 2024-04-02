package IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class IO22 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\java\\code\\_01code\\_02code\\src\\IO\\aaa.txt");
        ps.println(97);
        ps.print(true);
        ps.printf("%n 0721启动%d",99);
    }
}
