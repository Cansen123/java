package 多线程.Thread12;

import java.util.concurrent.ArrayBlockingQueue;

public class food extends Thread{
    ArrayBlockingQueue<String> queue ;

    public food(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try{
                String str = queue.take();
                System.out.println(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
