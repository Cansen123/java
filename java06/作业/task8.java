package work1;

import java.util.Scanner;
public class task8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int n1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int n2 = sc.nextInt();
        System.out.println("请输入第三个数");
        int n3 = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        fill(arr,n1,n2,n3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void fill(int[] arr,int fromIndex,int toIndex,int value){
        for (int i = fromIndex; i <= toIndex; i++) {
            arr[i] = value;
        }

    }
}
