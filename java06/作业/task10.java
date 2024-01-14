package work1;
import java.util.Scanner;
public class task10 {
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始的索引:");
        int from = sc.nextInt();
        System.out.println("请输入结束的索引:");
        int to = sc.nextInt();
        int brr[] = new int[to-from+1];
        brr = copyOf(arr,from,to);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }

    }
    public static int[]copyOf(int[] arr, int from,int to){
        int brr[] = new int[to-from+1];
        int count = 0;
        for (int i = from; i <= to ; i++) {
            brr[count++] = arr[i];
        }
        return brr;
    }
}
