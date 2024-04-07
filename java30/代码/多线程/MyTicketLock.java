package 多线程;

import java.util.concurrent.locks.ReentrantLock;

public class MyTicketLock extends Thread{
    static int ticket = 0;
    static ReentrantLock rl = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            rl.lock();
            try{
                sleep(10);
                if (ticket <= 10000) {
                    ticket++;
                    System.out.println(getName()+"--"+ticket);
                }else{
                    break;
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }finally{
                rl.unlock();
            }
        }
    }
}
