package Next;

import java.util.regex.Matcher;

public class Test2 {
    public static void main(String[]args){
        String str = "123456789";
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("数据错误");
        }else{
            System.out.println("数据正确");
        }
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            num = num*10 + c;
        }
        System.out.println(num);
    }
}
