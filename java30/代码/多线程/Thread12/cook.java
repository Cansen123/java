package 多线程.Thread12;

import java.util.concurrent.ArrayBlockingQueue;

public class cook extends Thread{
     ArrayBlockingQueue<String> queue ;
    public cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try{
                queue.put("面条");
                System.out.println("厨师做了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
