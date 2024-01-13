package work1;
import java.util.Scanner;
public class task7 {
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int brr[] = new int[10];
        int left = 0;
        int right = brr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                brr[right--] = arr[i];
            }else{
                brr[left++] = arr[i];
            }
        }
        System.out.print("新数组为:");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }

    }
}
