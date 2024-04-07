package Reflict.fans2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test4 {
    public static void main(String[]args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties pro = new Properties();
        FileInputStream fis = new FileInputStream("_02code\\src\\Reflict\\fans2\\propertes.properties");
        pro.load(new InputStreamReader(fis));
        System.out.println(pro);
        Class clazz = Class.forName((String)pro.get("ClassName"));
        Constructor o = clazz.getConstructor();
        Student stu = (Student)o.newInstance();
        System.out.println(stu);

        Method m = clazz.getDeclaredMethod((String)pro.get("Method"));
        m.setAccessible(true);
        m.invoke(stu);

    }
}
