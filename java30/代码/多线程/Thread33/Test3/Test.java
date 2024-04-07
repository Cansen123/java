package 多线程.Thread33.Test3;

public class Test {
    public static void main(String[] args){
        Odd odd1 = new Odd();
        Odd odd2 = new Odd();
        odd1.setName("线程1");
        odd2.setName("线程2");

        odd1.start();
        odd2.start();
    }
}
