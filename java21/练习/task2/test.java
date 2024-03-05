package task2;

public class test {
    public static void main(String[]args){
        int i = getSum(12);
        System.out.println(i);
    }
    public static int getSum(int x){
        if(x==1||x==2) {
            return 1;
        }else{
            return getSum(x-1)+getSum(x-2);
        }
    }

}
