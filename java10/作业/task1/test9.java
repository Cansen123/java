package task1;
import java.util.Scanner;
public class test9 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String arr = sc.next();

        while (true){
            if(checkArr(arr)){
                break;
            }else{
                System.out.println("当前字符串不符合规则，请重新输入");
                arr = sc.next();
            }
        }

        String []brr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length(); i++) {
            str.append(brr[arr.charAt(i)-'0']);
        }
        System.out.println(str);
    }

    public static boolean checkArr(String arr){
        if(arr.length()>9){
            return false;
        }else{
            return true;
        }
    }
}
