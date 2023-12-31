package work1;

import java.util.Scanner;
public class Test03 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n1;long n2; short n3; byte n4;
        float m1; double m2;
        char first_name;
        boolean ptr;

        n1 = sc.nextInt();
        n2 = sc.nextLong();
        n3 = sc.nextShort();
        n4 = sc.nextByte();
        m1 = sc.nextFloat();
        m2 = sc.nextDouble();
        first_name = sc.next().charAt(0);
        ptr = sc.nextBoolean();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(first_name);
        System.out.println(ptr);


    }
}
