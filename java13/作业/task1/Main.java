package task1;

public class Main {
    public static void main(String[]args){
        Lecturer p1 = new Lecturer("张三","001");
        Maintainer p2 = new Maintainer("李四","002");
        System.out.println(p1.getId()+" "+p1.getName());
        p1.work();
        System.out.println(p2.getId()+" "+p2.getName());
        p2.work();

    }
}
