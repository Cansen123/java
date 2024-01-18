package work1;

import java.util.Scanner;
import java.util.Random;
public class task3 {
    public static void main(String [] args) {
        Random r = new Random();
        char arr[] = new char[52];
        for(int i=0;i<52;i++){
            if(i<26){
                arr[i] =  (char)('a'+i) ;
            }else{
                arr[i] = (char)('A'+i-26);
            }
        }
        String result = "";
        for(int i=0;i<4;i++){
            int randomIndex = r.nextInt(52);
            result = result + arr[randomIndex];
        }
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);
    }
}
