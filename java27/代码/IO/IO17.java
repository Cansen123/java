package IO;

import java.io.*;

public class IO17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("_02code\\src\\IO\\aaa.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("_02code\\src\\IO\\ddd.txt"));
        String arr ;
        while((arr = br.readLine())!=null){
            bw.write(arr);
            bw.newLine();
        }
        bw.close() ; br.close();
    }
}
