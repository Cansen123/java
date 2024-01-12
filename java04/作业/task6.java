package work1;
import java.util.Scanner;
public class task6 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        System.out.println("请选择运算类型");
        int choose = sc.nextInt();
        switch (choose) {
            case 1 -> {
                System.out.println(num1 + "+"+num2+"="+ (num1 + num2));
            }
            case 2 -> {
                System.out.println(num1 + "-"+num2+"="+ (num1 - num2));
            }
            case 3 -> {
                System.out.println(num1 + "*"+num2+"="+ (num1 * num2));
            }
            case 4 -> {
                System.out.println(num1 + "/"+num2+"="+ (num1 / num2));
            }
            default -> {
                System.out.println("无该类型");
            }
        }
    }
}
