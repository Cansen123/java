package Reflict.fans2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[]args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("Reflict.fans2.Student");
        Constructor[] con1 = clazz.getConstructors();
        /*for (Constructor s : con1) {
            System.out.println(s);
        }*/
        //Constructor[] con2 = clazz.getDeclaredConstructors();
        /*for (Constructor s : con2) {
            System.out.println(s);
        }*/
        Constructor con3 = clazz.getDeclaredConstructor(String.class,int.class);
        //System.out.println(con3);
        /*Parameter[] pa = con3.getParameters();
        for (Parameter s : pa) {
            System.out.println(s);
        }*/
        con3.setAccessible(true);
        Student stu = (Student)con3.newInstance("123",11);
        System.out.println(stu);

    }
}
