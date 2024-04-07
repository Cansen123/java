package 多线程;

public class Thread4 {
    public static void main(String[] args){
        MyThread mt = new MyThread("0721");
        mt.start();
        Thread t = Thread.currentThread();

    }
}
