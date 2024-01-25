package task1;
import java.util.Scanner;
public class test2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String arr = sc.next();

        int BigCount = 0 , SmallCount = 0, NumberCount = 0;

        for (int i = 0; i < arr.length(); i++) {
            char c = arr.charAt(i);
            if(c>='a' && c<='z'){
                SmallCount++;
            }else if(c>='A' && c<='Z'){
                BigCount++;
            }else if(c>='0' && c<='9'){
                NumberCount++;
            }
        }
        System.out.println("大写字符有:" + BigCount + "个");
        System.out.println("小写字符有:" + SmallCount + "个");
        System.out.println("数字字符有:" + NumberCount + "个");
    }
}
