package 多线程.Thread33.Test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,200,100,500,800,2,80,300,700);
        MyCallable mc = new MyCallable(list);
        FutureTask<Integer> ft1 = new FutureTask<>(mc);
        FutureTask<Integer> ft2 = new FutureTask<>(mc);

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);

        t1.setName("奖池1");
        t2.setName("奖池2");

        t1.start();
        t2.start();

        Integer i1 = ft1.get();
        Integer i2 = ft2.get();
        if(i1==null){
            System.out.println("奖池2出现最大奖项"+i2+"元");
        }else if(i2==null){
            System.out.println("奖池1出现最大奖项"+i1+"元");
        }else{
            if(i1<i2){
                System.out.println("奖池2出现最大奖项"+i2+"元");
            }else{
                System.out.println("奖池1出现最大奖项"+i1+"元");
            }
        }
    }
}
