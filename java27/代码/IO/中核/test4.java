package IO.中核;

import java.io.*;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\新建文件夹\\jk.txt"));
        String str = br.readLine();
        br.close();

        String[] arr = str.split("&");
        String [] arr1 = arr[0].split("=");
        String[] arr2 = arr[1].split("=");
        String[] arr3 = arr[2].split("=");

        String username = arr1[1];
        String password = arr2[1];
        int count = Integer.parseInt(arr3[1]);

        System.out.println(username);
        System.out.println(password);
        System.out.println(count);

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入账号");
        String inputUsername = sc.nextLine();
        System.out.println("请输入密码");
        String inputPassword = sc.nextLine();

        if(username.equals(inputUsername) && password.equals(inputPassword)){
            System.out.println("登陆成功");count = 0;
            writein("D:\\java\\新建文件夹\\jk.txt","username="+username+"&password="+password+"&count="+count);
        }else{
            count++;
            if (count<3) {
                System.out.println("登录失败，还有"+(3-count)+"次机会");
                writein("D:\\java\\新建文件夹\\jk.txt","username="+username+"&password="+password+"&count="+count);
            }else{
                System.out.println("失败次数过多，账号已被锁定");
            }
        }
    }
    public static void writein(String path,String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write(message);
        bw.newLine();
        bw.close();
    }
}
