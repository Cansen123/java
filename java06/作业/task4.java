package work1;

import java.util.Scanner;
public class task4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小数");
        double x = sc.nextDouble();
        System.out.println("小数的绝对值为:"+ abs(x));
    }
    public static double abs(double x){
        if(x>=0){
            return x;
        }else{
            return -x;
        }
    }
}
