package task4;
import java.util.Scanner;
public class task4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        str = str.toLowerCase();

        int alphabet = 0 , digital = 0;

        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                digital++;
            } else if (c >= 'a' && c <= 'z') {
                alphabet++;
            }
        }

        System.out.println("字符串中有"+digital+"个数字");
        System.out.println("字符串中有"+alphabet+"个字母");
    }
}
