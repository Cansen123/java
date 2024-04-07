package 多线程.Thread33.Thread11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[]args) throws InterruptedException {
        //ExecutorService es = Executors.newCachedThreadPool();
        ExecutorService es = Executors.newCachedThreadPool();
        es.submit(new MyThread());
        Thread.sleep(1000);
        es.submit(new MyThread());
        Thread.sleep(1000);
        es.submit(new MyThread());
        Thread.sleep(1000);
        es.submit(new MyThread());
        Thread.sleep(1000);
        es.submit(new MyThread());
        Thread.sleep(1000);
        es.submit(new MyThread());
        Thread.sleep(1000);
    }
}
