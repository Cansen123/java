package work1;

import java.util.Scanner;
public class task5 {
    public static void main(String [] args) {
    int arr[] = getScore();
    int min = getMin(arr);
    int max = getMax(arr);
    int total = getTotal(arr);
    int result = getResult(total,min,max);
    System.out.println("最后的分数是:"+result);
    }

    public static int[] getScore(){
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;){
            System.out.println("请输入评委打分:");
            int score = sc.nextInt();
            if(score>=0&&score<=100){
                arr[i] = score;
                i++;
            }else{
                System.out.println("成绩超出范围，继续录入，当前的i为:"+i);
            }
        }
        return arr;
    }

    public static int getMin(int arr[]){
        int min = arr[0];
        for(int i=1;i<6;i++){
            if(min<arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMax(int arr[]){
        int max = arr[0];
        for(int i=1;i<6;i++){
            if(max>arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getTotal(int arr[]){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static int getResult(int total,int min,int max){
        int result = total - min - max;
        return result;
    }


}
