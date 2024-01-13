package work1;

import java.util.Scanner;
public class task4 {
    public static void main(String [] args){
        int arry[] = {2, 1, 3, 5, 4};
        int sum =0;
        for (int i = 0; i < arry.length; i++) {
            sum = sum*10 + arry[i];
        }
        System.out.println("数组表示的数为"+ sum);
    }
}
