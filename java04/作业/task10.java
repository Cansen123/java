package work1;
import java.util.Scanner;
public class task10 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数 ");
        int x = sc.nextInt();
        int a =x;
        int num =0;
        while(x !=0){
            int ge = x%10;
            num  = num*10 + ge;
            x /= 10;
        }
        System.out.println(a==num);

    }
}
