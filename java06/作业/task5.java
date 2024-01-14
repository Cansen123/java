package work1;

import java.util.Scanner;
public class task5 {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入正整数:");
    int a = sc.nextInt();
    System.out.println(a+"是"+bite(a)+"位数字");
    }
    public static int bite(int a){
        int count =0;
        while(a>0){
            count++;
            a /=10;
        }
        return count;
    }
}
