package 多线程;

public class Thread9 {
    public static void main(String[] args){
        MyticketRannalbe mr = new MyticketRannalbe();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.start();
        t2.start();
        t3.start();
    }
}
