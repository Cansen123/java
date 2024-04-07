package 多线程.Thread12;

import java.util.concurrent.ArrayBlockingQueue;

public class demon {


    public static void main(String[] args){
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        cook c = new cook(queue);
        food f = new food(queue);

        c.start();
        f.start();

    }
}
