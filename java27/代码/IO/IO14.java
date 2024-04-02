package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class IO14 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\java\\code\\_01code\\_02code\\src\\IO\\ddd.txt");
       //FileWriter fw = new FileWriter("D:\\java\\code\\_01code\\_02code\\src\\IO\\ddd.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while((ch = fr.read())!=-1){
            sb.append((char)ch);
        }
        fr.close();
       // System.out.println(sb);
       Integer [] arr = Arrays.stream(sb.toString().split("-")).map(Integer::parseInt).sorted().toArray(Integer[]::new);
       // System.out.println(arr.toString());
        //System.out.println(Arrays.toString(arr));
        String pp = Arrays.toString(arr).replace(", ","-");
        //System.out.println(pp);
        String result = pp.substring(1,pp.length()-1);
        FileWriter fw = new FileWriter("D:\\java\\code\\_01code\\_02code\\src\\IO\\ddd.txt");
        fw.write(result);
        fw.close() ;
    }
}
