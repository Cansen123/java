package work1;

import java.util.Scanner;
public class task3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入金额");
        double money = sc.nextInt();
        System.out.println("请选择储存方式");
        int sw = sc.nextInt();
        switch(sw){
            case 1->{money *= 0.0225;}
            case 2->{
                for(int i=1;i<=2;i++) {
                    money = money * 0.027 + money;
                }
            }
            case 3->{
                for(int i=1;i<=3;i++){
                    money = money * 0.0325 + money;
                }
            }
            case 4->{
                for(int i=1;i<=5;i++){
                    money = money * 0.036;
                }
            }
            default->{System.out.println("无该选项");}
        }
        System.out.println("总额为 "+ money);

    }
}
