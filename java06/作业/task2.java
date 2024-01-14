package work1;

import java.util.Scanner;
public class task2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数是:");
        int a = sc.nextInt();
        System.out.println("第二个数是:");
        int b = sc.nextInt();
        System.out.println("第三个数是:");
        int c = sc.nextInt();
        System.out.print("最大值为"+ max(a,b,c));
    }
    public static int max(int a,int b,int c){
        return  a>b? a>c?a:c:b>c?b:c;
    }
}
