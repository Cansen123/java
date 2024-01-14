package work1;

import java.util.Scanner;
import java.util.Random;
public class task11 {
    public static void main(String [] args){
        int arr[] = {2,588,888,1000,10000};
        int brr[] = new int[5];
        Random r = new Random();
        int index = 0;

        while(index!=5){
            int i = r.nextInt(5);
            if(check(brr,i)){
                index++;
                brr[i] = arr[i];
                System.out.println(arr[i]+"元的奖金被抽出");
            }
        }
        int i = r.nextInt(5);

    }
    public static boolean check(int brr[],int i){
        if(brr[i]!=0){
            return false;
        }else{
            return true;
        }
    }
}
