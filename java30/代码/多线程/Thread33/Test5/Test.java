package 多线程.Thread33.Test5;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,200,100,500,800,2,80,300,700);
        MyThread m1 = new MyThread(list);
        MyThread m2 = new MyThread(list);
        m1.setName("奖池1");
        m2.setName("奖池2");
        m1.start();
        m2.start();
    }
}
