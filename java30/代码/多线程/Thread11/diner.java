package 多线程.Thread11;

public class diner extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (desk.lock){
                if(desk.count==0){
                    break;
                }else{
                    try{
                        if(desk.foodFlag==0){
                            desk.lock.wait();
                        }else{
                            desk.count--;
                            System.out.println("吃货还能吃"+desk.count+"碗");
                            desk.foodFlag= 0;
                            desk.lock.notifyAll();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
