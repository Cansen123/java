package work1;
import java.util.Scanner;
public class task9 {
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入复制个数:");
        int newLength = sc.nextInt();
        int brr[] = new int[newLength];
        brr = copyOf(arr,newLength);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }

    }
    public static int[]copyOf(int[] arr, int newLength){
        int brr[] = new int[newLength];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = arr[i];
        }
        return brr;
    } 
}
