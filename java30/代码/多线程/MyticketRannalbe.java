package 多线程;

import java.io.IOException;

public class MyticketRannalbe implements Runnable{
    int ticket = 0;
    @Override
    public void run() {

        while(true){
            try{
                Thread.sleep(10);
            }catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if (method()) break;
        }
    }

    private synchronized boolean method() {
        if(ticket<=100){
            ticket++;
            System.out.println(Thread.currentThread().getName()+"--"+ticket);

        }else{
            return true;
        }
        return false;
    }
}
