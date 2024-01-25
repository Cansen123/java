package task6;
import java.util.Scanner;
public class task6 {
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号");
        String str = sc.nextLine();

        boolean flag = check(str);
        if(flag){
            System.out.println("输入号码合法");
        }else{
            System.out.println("输入号码不合法");
        }

    }
    public static boolean check(String str){
        if(str.length()!=18 || str.charAt(0)=='0'){
            return false;
        }
        for(int i = 0;i<str.length();i++){
            if((str.charAt(i)>'9'||str.charAt(i)<'0')){
                if(i==17 && str.charAt(i)=='X'){
                    break;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
