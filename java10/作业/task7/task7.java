package task7;
import java.util.Scanner;
import java.util.StringJoiner;
public class task7 {
    public static void main(String[]args){
        int[] num = {1,2,3,4,5,6};
        String str = appendNumber(num);
        System.out.println(str);
    }

    public static String appendNumber(int[]num){
        StringJoiner str = new StringJoiner(", ", "[","]");
        for(int i=0;i<num.length;i++){
            str.add(num[i]+"");
        }
        return str.toString();
    }
}
