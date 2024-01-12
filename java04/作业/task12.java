package work1;
import java.util.Scanner;
public class task12 {
    public static void main(String[] args){
        int front = 1949;
        int rear = 2019;
        for(int i = front ; i<= rear;i++){
            int num = rear - i;
            if(num%12==0){
                System.out.println(i);
            }
        }
    }
}
