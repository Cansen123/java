package task1;
import java.util.Scanner;
public class test4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String s = "";
        for (int i = str.length()-1; i >= 0; i--) {
            s  = s+str.charAt(i);
        }
        return s;
    }
}
