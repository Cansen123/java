package 多线程.Thread33.Test4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class UPMT extends Thread{
    static  BigDecimal money = BigDecimal.valueOf(100.0);
    static int count = 3;
    static Object obj = new Object();
    static final BigDecimal MIN = BigDecimal.valueOf(0.01);

    @Override
    public void run() {
        synchronized(obj){
            if(count==0){
                System.out.println(getName()+"没抢到红包");
            }else{
                BigDecimal prize ;
                if(count==1){
                    prize = money.setScale(2, RoundingMode.HALF_UP);
                    System.out.println(getName()+"抢到了"+prize+"元的红包");
                }else{
                    double bounds = money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                    Random r = new Random();
                    prize = BigDecimal.valueOf(r.nextDouble(MIN.doubleValue(),bounds)).setScale(2,RoundingMode.HALF_UP);
                    System.out.println(getName()+"抢到了"+prize+"元的红包");
                }
                count--;
                money = money.subtract(prize);
            }
        }
    }
}
