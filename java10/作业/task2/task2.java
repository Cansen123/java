package task2;
import java.util.Random;
import java.util.Scanner;
public class task2 {
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("请输入一个字符串");
     String str = sc.next();

     char[] arr = str.toCharArray();
     String newStr = rostate(arr);

     System.out.println(newStr);
    }

    public static String rostate(char[] arr){
        Random r = new Random();
        for(int i = 0;i < arr.length;i++){
            int number = r.nextInt(arr.length);
            char ar = arr[number];
            arr[number] = arr[i];
            arr[i] = ar;
        }
        String str = new String(arr);
        return str;
    }
}
