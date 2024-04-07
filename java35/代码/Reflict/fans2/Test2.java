package Reflict.fans2;

import java.lang.reflect.Field;

public class Test2 {
    public static void main(String[]args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("Reflict.fans2.Student");
       /* Field[] list1 = clazz.getDeclaredFields();
        for (Field s : list1) {
            System.out.println(s);
        }*/
        Field name = clazz.getDeclaredField("name");
        //System.out.println(name);
        int modifiers = name.getModifiers();
        //System.out.println(modifiers);
        Class<?> type = name.getType();
        //System.out.println(type);
        Student s = new Student("zhangsan",23);
        name.setAccessible(true);
        String value = (String) name.get(s);
        System.out.println(value);

        name.set(s,"lisi");
        System.out.println(s);
    }
}
