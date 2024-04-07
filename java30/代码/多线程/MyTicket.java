package 多线程;

public class MyTicket extends Thread{
    static int ticket = 0;
    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized(MyTicket.class){
                if(ticket<100){
                    System.out.println(getName()+"卖第"+ticket+"张票");
                    ticket++;
                }else{
                    break;
                }
            }
        }
    }
}
