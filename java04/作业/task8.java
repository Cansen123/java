package work1;

import java.util.Scanner;
public class task8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int n1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int n2 = sc.nextInt();
        int count =0;
        if(n1>n2) {
            for (int i = n2; i <= n1; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    count++;
                }
            }
        }else{
                for(int i=n1;i<=n2;i++){
                    if(i%3==0 && i%5==0){
                        count++;
                    }
                }
            }
        System.out.println("有"+count+"个数符合条件");

    }
}
