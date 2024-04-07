package 多线程.Thread33.Test3;

public class Odd extends Thread{
    static int number = 1;
    static Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized(obj){
                if(number<=100){
                    if(number%2!=0){
                        System.out.println(getName()+"输出奇数"+number);
                    }
                    number++;
                }else{
                    break;
                }
            }
        }
    }
}
