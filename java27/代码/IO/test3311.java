package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class test3311 {
    public static void main(String []args) throws IOException {
        ArrayList<Student> stu = new ArrayList<>();
        Collections.addAll(stu,new Student("zhangsan",22),new Student("lisi",23),new Student("wangwu",24));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\java\\code\\_01code\\_02code\\src\\IO\\ppp.txt"));
        oos.writeObject(stu);
        oos.close();
    }
}
