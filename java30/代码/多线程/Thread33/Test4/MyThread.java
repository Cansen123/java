package 多线程.Thread33.Test4;

import java.util.Random;

public class MyThread extends Thread{
    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;
    static Object  obj = new Object();
    @Override
    public void run() {
        synchronized(obj){
            if(count==0){
                System.out.println(getName()+"没抢到红包");
            }else{
                double prize = 0;
                if(count==1){
                    prize = money;
                    System.out.println(getName()+"抢到"+prize+"元红包");
                }else{
                    Random r = new Random();
                    prize = r.nextDouble(MIN,money-(count-1)*MIN);
                    System.out.println(getName()+"抢到"+prize+"元红包");
                }
                money = money- prize;
                count--;
            }
        }
    }
}
