package test3;

public class test {
    public static void main(String []args){
        int i = getSum(1);
        System.out.println(i);
    }
    public static int getSum(int x){
        if(x==10){
            return 1;
        }else{
            return (getSum(x+1)+1)*2;
        }

    }
}
