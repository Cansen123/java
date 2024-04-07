package 多线程.Thread33.Test2;

public class Test {
    public static void main(String[] args){
        Gift g = new Gift();
        Thread t1 = new Thread(g);
        Thread t2 = new Thread(g);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
