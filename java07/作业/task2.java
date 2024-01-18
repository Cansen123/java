package work1;

import java.util.Scanner;
public class task2 {
    public static void main(String [] agrs){
        int count = 0;
        for(int i=101;i<=200;i++){
            boolean flag = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.println("当前数字"+i+"是质数");
            }
        }
        System.out.println("共有"+count+"个指数");
    }
}
