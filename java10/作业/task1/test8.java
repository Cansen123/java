package task1;
import java.util.Scanner;
public class test8 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入要说的话");
        String str = sc.next();

        String[] arr = {"TMD","GDX","ctmd","ZZ","lj","FW","nt"};

        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i],"***");
        }
        System.out.println(str);
    }
}
