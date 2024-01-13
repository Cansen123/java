package work1;

import java.util.Scanner;
import java.util.Random;
public class task3 {
    public static void main(String [] args){
        Random r = new Random();
        int num[] = new int[6];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(100);
            sum += num[i];
        }
        System.out.println("数组之和为 "+sum);
    }
}
