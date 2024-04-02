package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class test3322 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\java\\code\\_01code\\_02code\\src\\IO\\ppp.txt"));
        ArrayList<Student> list = (ArrayList<Student>)ois.readObject();
        ois.close();
        System.out.println(list);
    }
}
