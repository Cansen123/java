package Next;
import java.util.ArrayList;
import java.util.Scanner;
public class Test1 {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int all = 0;
        while(true){
            System.out.println("请输入一个常数");
            String str = sc.nextLine();
            int i = Integer.parseInt(str);
            if(!(i>0 && i<=100)){
                System.out.println("输入的数据不符合,请重新输入");
                continue;
            }
            list.add(i);
            all += i;
            if(all>200){
                System.out.println("集合中数据和已经超过200");
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
