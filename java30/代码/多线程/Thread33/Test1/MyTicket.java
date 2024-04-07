package 多线程.Thread33.Test1;

import java.util.concurrent.locks.ReentrantLock;

public class MyTicket extends Thread{
    static int ticket = 0;
    static ReentrantLock rl = new ReentrantLock();
    @Override
    public void run() {
        while(true){
            rl.lock();
            try {
                if (ticket<1000) {
                    sleep(3000);
                    ticket++;
                    System.out.println(getName()+"已经卖出第"+ticket+"张票");
                }else{
                    break;
                }
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }finally{
                rl.unlock();
            }
        }
    }
}
