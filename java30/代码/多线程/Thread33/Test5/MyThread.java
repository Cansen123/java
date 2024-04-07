package 多线程.Thread33.Test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    static ArrayList<Integer> list  ;
    static Object obj = new Object();

    public MyThread(ArrayList<Integer>list) {
        this.list =list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while(true){
            synchronized (obj){
                if(list.size()==0){
                    System.out.println(getName()+"出了"+boxList);
                    break;
                }else{
                    Collections.shuffle(list);
                    boxList.add(list.remove(0));
                }
            }
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
