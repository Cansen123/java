package work1;

import java.util.Scanner;
import java.util.Random;
public class task3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数是:");
        int a = sc.nextInt();
        System.out.println("第二个数是:");
        int b = sc.nextInt();
        System.out.println("第三个数是:");
        int c = sc.nextInt();
        prin(a,b,c);
    }
    public static void prin(int a,int b,int c){
        int temp;
        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        if(a<c){
            temp = c;
            c = a;
            a = temp;
        }
        if(b<c){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("从大到小的顺序是："+a+" "+b+" "+c);
    }
}
