package IO;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class test1122 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\code\\_01code\\_02code\\src\\IO\\ddd.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\code\\_01code\\_02code\\src\\IO\\copy.txt"));
        TreeMap<Integer,String> tm = new TreeMap<>();
        String line;
        while((line = br.readLine())!=null){
            int value = Integer.parseInt(line.split("\\.")[0]);
            tm.put(value,line);
        }
        br.close();

        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();

    }
}
