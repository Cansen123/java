package Reflict.fans2;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Properties;

public class Test3 {
    public static void main(String[]args) throws IllegalAccessException, IOException {
        Student stu = new Student("zhangsan",20);
        //System.out.println(stu);
        setto(stu);
    }
    public static void setto(Student stu) throws IllegalAccessException, IOException {
        Class clazz = stu.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Properties pro = new Properties();
        for (Field field : fields) {
           field.setAccessible(true);
            String name = field.getName();
            Object obj = field.get(stu);
            pro.put(name,obj.toString());
        }
        pro.store(new OutputStreamWriter(new FileOutputStream("D:\\java\\code\\_01code\\_02code\\src\\反射\\fans2\\aaa.txt")),"test");
    }
}
