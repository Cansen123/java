package task1;
import java.util.Random;
import java.util.Scanner;
public class test6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();

        String start = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7);

        String result = start + "****" + end;

        System.out.println(result);

    }
}
