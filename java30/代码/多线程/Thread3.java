package 多线程;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Mycallable mc = new Mycallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t = new Thread(ft);
        t.start();
        System.out.println(ft.get());
    }
}
