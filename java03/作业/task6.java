package work1;
import java.util.Scanner;
public class task6 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入第一个数:");
    int num1 = sc.nextInt();
    System.out.println("请输入第二个数:");
    int num2 = sc.nextInt();
    System.out.println(((num1+num2)%6==0)||num1==6||num2==6);
    }
}
