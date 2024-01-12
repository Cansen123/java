package work1;

import java.util.Scanner;
public class task5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总收入");
        double total = sc.nextDouble();
        double tax=0;
        double money = total;
        total -= 5000;
        if(total>0&&total<=3000){
            tax = total*0.03;
        }else if(total>3000&&total<=12000){
            tax = total*0.1;
        }else if(total>12000 && total<=25000){
            tax = total*0.2;
        }else if(total>25000&&total<=35000){
            tax = total*0.25;
        }else if(total>35000&&total<=55000){
            tax = total*0.3;
        }else if(total>55000&&total<=80000){
            tax = total*0.35;
        }else if(80000<total){
            tax = total* 0.45;
        }
        System.out.println("税额为"+ tax );
        System.out.println("税后工资为 "+(money-tax));
    }
}
