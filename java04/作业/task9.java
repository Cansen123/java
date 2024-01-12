package work1;

public class task9 {
    public static void main(String [] args){
        double mountain = 8844430;
        double parper = 0.1;
        int count = 0;
        while(parper < mountain){
            parper *= 2;
            count++;
        }
        System.out.println(count);
    }
}
