package Internet.FinalTest.Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cilen {
    public static void main(String[]args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1",10009);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------欢迎来到聊天室--------------");
            System.out.println("请选择：");
            System.out.println("1、登录");
            System.out.println("2、注册");
            String preference = sc.nextLine();
            bw.write(preference);
            bw.newLine();
            bw.flush();
            switch(preference.charAt(0)){
                case '1' ->{
                    if(login(socket)){
                        Talk(bw,br);
                    }

                }
                case '2'->{
                    register(bw,br);
                }
            }
        }

    }
    public static void register (BufferedWriter bw , BufferedReader br) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要注册的用户名：");
        String username = sc.nextLine();
        System.out.println("请输入要注册的密码：");
        String password = sc.nextLine();
        bw.write(username);
        bw.newLine();
        bw.flush();
        bw.write(password);
        bw.newLine();
        bw.flush();
        String str = br.readLine();
        System.out.println(str);
    }
    public static void Talk(BufferedWriter bw,BufferedReader br ) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        Thread t = new Thread(new Clientable(br));
        t.join();
        t.start();
        System.out.println("请发出你想说的话：");
        while (true) {
            String str = sc.nextLine();
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
    }

    private static boolean login(Socket socket) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw1.write(username);
        bw1.newLine();
        bw1.flush();
        bw1.write(password);
        bw1.newLine();
        bw1.flush();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = br1.readLine();
        char ch = message.charAt(0);
        if(ch=='1'){
            System.out.println("登录成功");
            return true;
        }else if(ch=='2'){
            System.out.println("没有该账号");
        }else{
            System.out.println("密码错误");
        }
        return false;
    }

}
