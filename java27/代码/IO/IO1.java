package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("_02code\\src\\IO\\aaa.txt");
        file.write(97);
        file.close();
    }
}
