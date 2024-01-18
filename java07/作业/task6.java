package work1;
import java.util.Scanner;
public class task6 {
    public static void main(String [] args) {
        int arr[] = buildCode();
        for(int i=0;i<arr.length;i++){
            arr[i] += 5;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] %= 10;
        }
        for(int i=0, j= arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int total = 0 ;
        for(int i=0;i<arr.length;i++){
            total = total * 10 + arr[i];
        }
        System.out.println(total);
    }

    public static int [] buildCode(){
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int temp = number;
        while(temp>0){
            count++;
            temp /= 10;
        }
        int arr[] = new int[count];
        for(int i=arr.length-1;i>=0;i--){
            arr[i] = number % 10;
            number /= 10;
        }
        return arr;
    }
}
