package work1;
import java.util.Scanner;
public class task6 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {12,14,23,45,66,68,70,77,90,91};
        int brr[] = new int[11];
        System.out.println("请输入插入的数");
        int num = sc.nextInt();
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(num>=arr[i]){
                brr[i] = arr[i];
            }else{
                brr[i+1] = arr[i];
                if(index ==-1){
                    index = i;
                }
            }

        }
        brr[index] = num;
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}
