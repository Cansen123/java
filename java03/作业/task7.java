package work1;
import java.util.Scanner;
public class task7 {
    public static void main(String [] args){
        System.out.println("请输入数字: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100;
        System.out.println(ge+shi+bai);

    }
}
