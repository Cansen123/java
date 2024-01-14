package work1;
import java.util.Scanner;
public class task6 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {1,2,3,4,5,6};
        int brr [] = {1,2,3,4,5};
        System.out.println("结果为:"+ equals(arr,brr));
    }
    public static boolean equals(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true ;
    }
}
