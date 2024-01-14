package work1;

import java.util.Scanner;
public class task1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        System.out.println("较小的数为"+min(a,b));
        }

    public static int min(int a,int b){
    return a<b?a:b;

    }
}
