package 多线程;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+"--"+i);
            //Thread.yield();
        }
    }
}
