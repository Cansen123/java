package 多线程;

public class Thread6 {
    public static void main(String[]args){
        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t2.setDaemon(true);

        t1.setName("女神");
        t2.setName("备胎");

        t1.start();
        t2.start();
    }
}
