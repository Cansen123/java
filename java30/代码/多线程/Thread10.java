package 多线程;

public class Thread10 {
    public static void main(String[] args){
        MyTicketLock mtl1 = new MyTicketLock();
        MyTicketLock mtl2 = new MyTicketLock();
        MyTicketLock mtl3 = new MyTicketLock();

        mtl1.setName("线程1");
        mtl2.setName("线程2");
        mtl3.setName("线程3");

        mtl1.start();
        mtl2.start();
        mtl3.start();
    }
}
