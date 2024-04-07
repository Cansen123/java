package 多线程.Thread33.Test1;

public class demon {
    public static void main(String[] args){
        MyTicket mt1 = new MyTicket();
        MyTicket mt2 = new MyTicket();
        //MyTicket mt3 = new MyTicket();
        mt1.setName("售票窗口1");
        mt2.setName("售票窗口2");

        mt1.start();
        mt2.start();
    }
}
