package work1;

public class task13 {
    public static void main(String [] args){
        int front = 1988;
        int rear = 2019;
        for(int i=front;i<=rear;i++){
            if(i%4==0 && i%100 !=0){
                System.out.println(i);
            }else if(i%400==0){
                System.out.println(i);
            }
        }
    }
}
