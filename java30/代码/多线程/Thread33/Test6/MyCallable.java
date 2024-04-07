package 多线程.Thread33.Test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    static ArrayList<Integer> list ;
    static Object obj = new Object();
    public MyCallable(ArrayList<Integer> list){
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList = new ArrayList<>();
        while(true){
            synchronized (obj){
                if(list.size()==0){
                    System.out.println(Thread.currentThread().getName()+"出了"+boxList);
                    break;
                }else{
                    Collections.shuffle(list);
                    boxList.add(list.remove(0));
                }
            }
            Thread.currentThread().sleep(10);
        }
        if(boxList.size()==0){
            return null;
        }else{
            return Collections.max(boxList);
        }
    }
}
