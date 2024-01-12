package work1;

import java.util.Scanner;
public class task4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总消费金额");
        double total = sc.nextDouble();
        System.out.println("是否是会员");
        int type = sc.nextInt();
        if(type==1){
            if(total>=200){
                total *= 0.75;
            }else{
                total *= 0.8;
            }
        }else{
            if(total>=100){
                total *= 0.9;
            }
        }
        System.out.println("需要支付 "+total);
    }
}
