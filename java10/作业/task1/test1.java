package task1;

import java.util.Scanner;
public class test1 {
    public static void main(String [] args){
        String rightUseName = "zhangsan";
        String rightPassword = "123456";

        for (int i=0;i<3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String UseName = sc.next();
            System.out.println("请输入密码");
            String Password = sc.next();


            if(UseName.equals(rightUseName) && Password.equals(rightPassword)){
                System.out.println("登陆成功");
                break;
            }else{
                if(i==2){
                    System.out.println("账户" + UseName + "被锁定，请联系黑马程序员官方小姐姐：XXXXXXX");
                }else {
                    System.out.println("用户名或密码错误，登录失败,还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }
}
