package work1;

import java.util.Scanner;
public class task1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        int tocket = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入是经济舱(1)或头等舱(0)");
        int seat = sc.nextInt();
        if(month>=5&&month<=10){
            tocket = getPrice(tocket,seat,0.9, 0.85);
        }else if(month<=12&& month>0){
            tocket = getPrice(tocket,seat,0.7,0.65);
        }else{
            System.out.println("这个月份不合法");
        }

        System.out.println("票价为:"+tocket);
    }
    public static int getPrice(int tocket, int seat, double v0, double v1){
        if(seat == 0){
              tocket = (int)(tocket * v0);
        }else if(seat ==1){
             tocket = (int)(tocket * v1);
        }else{
            System.out.println("没有这个座位");
        }
        return tocket;
    }
}
