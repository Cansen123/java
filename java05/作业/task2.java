package work1;

import java.util.Scanner;
public class task2 {
    public static void main(String [] args){
        double arry [] = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if(min>arry[i]){
                min = arry[i];
            }
        }
        System.out.print("最小值为"+min);
    }
}
