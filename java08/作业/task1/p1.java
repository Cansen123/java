package task1;
import java.util.Scanner;
public class p1 {
    public static void main(String [] args) {
        Phone p = new Phone();
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入手机的品牌:");
        p.brand = sc.next();
        System.out.println("请输入手机的价格:");
        p.price = sc.nextInt();
        System.out.println("请输入手机的颜色:");
        p.color = sc.next();

        p.call();
        p.sendMessage();
    }

}
