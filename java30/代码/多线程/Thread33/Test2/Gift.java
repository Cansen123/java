package 多线程.Thread33.Test2;

import java.util.concurrent.locks.ReentrantLock;

public class Gift implements Runnable{
    ReentrantLock rl = new ReentrantLock();
    int gift = 100;
    @Override
    public void run() {
        while(true){
            rl.lock();
            try{
                if(gift>=10){
                    gift--;
                    System.out.println(Thread.currentThread().getName()+"发出礼物，现在剩余"+gift+"份礼物");
                }else{
                    break;
                }
            }finally{
                rl.unlock();
            }
        }
    }
}
