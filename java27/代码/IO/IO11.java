package IO;

import java.io.FileReader;
import java.io.IOException;

public class IO11 {
    public static void main(String[]args) throws IOException {
        FileReader fr =  new FileReader("_02code\\src\\IO\\aaa.txt");

        char [] chars = new char[2];
        int len ;
        while((len = fr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        fr.close();
    }
}
