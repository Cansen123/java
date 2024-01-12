package work1;
import java.util.Scanner;
public class task7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一数字: ");
        int num1 = sc.nextInt();
        System.out.println("请输入第二数字: ");
        int num2 = sc.nextInt();
        int maxn = num1 >= num2? num1:num2;
        int minn = num1 <= num2? num1:num2;
        int count = 0;
        for(int i = minn;i<=maxn;i++)
        {
            count += i;
        }
        System.out.println("范围内数字之和为"+count);

    }
}
