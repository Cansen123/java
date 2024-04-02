package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IO20 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\java\\code\\_01code\\_02code\\src\\IO\\aaa.txt"));
        Student stu = (Student) ois.readObject();
        System.out.println(stu);
        ois.close();
    }
}
