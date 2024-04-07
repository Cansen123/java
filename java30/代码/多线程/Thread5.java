package 多线程;

public class Thread5 {
    public static void main(String[] args){
        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.setPriority(1);
        t2.setPriority(10);
        t1.setName("飞机");
        t2.setName("坦克");
        t1.start();
        t2.start();
    }
}
