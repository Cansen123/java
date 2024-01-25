package task3;
import java.util.Random;
public class task3 {
    public static void main(String[] args){
        char[]str = alphabet();

        Random r = new Random();
        int j = r.nextInt(10);
        int sum = j + '0';
        str[4] = (char)sum;

        j = r.nextInt(4);
        char c = str[j];
        str[j] = str[4];
        str[4] = c;

        String arr = new String(str);
        System.out.println(arr);
    }
    public static char[] alphabet(){
        char[] arr = new char[52];
        for(int i=0;i<arr.length;i++){
            if(i<26){
                int sum = 'a' + i;
                arr[i] = (char)sum;
            }else{
                int sum = 'A' +i - 26;
                arr[i] = (char)sum;
            }
        }
        Random r = new Random();
        char[] str = new char[5];
        for(int i=0;i<4;i++)
        {
            int j = r.nextInt(52);
            str[i] = arr[j];

        }
        return str;
    }
}
