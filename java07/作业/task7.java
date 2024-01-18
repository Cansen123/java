package work1;
import java.util.Scanner;
public class task7 {
    public static void main(String [] args){
        int arr[] = {8,3,4,6};
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=4){
                arr[i] += 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 5;
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total * 10 + arr[i];
        }
        System.out.println(total);
    }
}
