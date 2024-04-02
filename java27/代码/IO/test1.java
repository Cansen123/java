package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\Java基础-资料\\day29-IO（其他流）\\资料\\csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\code\\_01code\\_02code\\src\\IO\\ddd.txt"));
        String line ;
        ArrayList<String> al = new ArrayList<>();
        while((line = br.readLine()) != null){
            al.add(line);
        }
        br.close();
        al.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int p1 = Integer.parseInt(o1.split("\\.")[0]);
                int p2 = Integer.parseInt(o2.split("\\.")[0]);

                return p1-p2;
            }
        });
        for (String s : al) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();


    }

}
