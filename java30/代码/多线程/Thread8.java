package 多线程;

public class Thread8 {
    public static void main(String [] args){
        MyTicket mt1 = new MyTicket();
        MyTicket mt2 = new MyTicket();
        MyTicket mt3 = new MyTicket();

        mt1.setName("售票1");
        mt2.setName("售票2");
        mt3.setName("售票3");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
