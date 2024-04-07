package 多线程.Thread11;

public class cooker extends Thread {
    @Override
    public void run() {
        while(true){
            synchronized (desk.lock){
                if(desk.count==0){
                    break;
                }else{
                    try{
                        if(desk.foodFlag==1){
                            desk.lock.wait();
                        }else{
                            desk.foodFlag = 1;
                            System.out.println("厨师做了一碗面条");
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
