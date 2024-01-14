package work1;
import java.util.Scanner;
public class task7 {
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入改成的数:");
        int value = sc.nextInt();
        fill(arr,value);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i]= value;
        }
    }
}
