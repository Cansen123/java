package 多线程;

public class Thread7 {
    public static void main(String[]args) throws InterruptedException {
        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr);
        t1.setName("线程1");

        t1.start();
        t1.join();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("main线程--"+ i);
        }
    }
}
