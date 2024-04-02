package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IO19 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\java\\code\\_01code\\_02code\\src\\IO\\aaa.txt"));
        Student stu = new Student("zhangsan", 23);
        oos.writeObject(stu);
        oos.close();
    }
}
