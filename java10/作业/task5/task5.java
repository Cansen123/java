package task5;
import java.util.Scanner;
public class task5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        System.out.println(check(str));
    }
    public static boolean check(String str){
        StringBuilder newStr = new StringBuilder(str);
        String brr = newStr.reverse().toString();
        if(str.equals(brr)){
            return true;
        }else{
            return false;
        }
    }
}
