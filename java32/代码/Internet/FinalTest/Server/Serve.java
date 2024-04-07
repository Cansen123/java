package Internet.FinalTest.Server;

import Internet.Test4.Server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class Serve {
    static ArrayList<Socket> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10009);
        Properties properties = new Properties();
        BufferedReader br = new BufferedReader(new FileReader("_02code\\src\\Internet\\FinalTest\\user.txt"));
        properties.load(br);
        br.close();
        while(true){
            Socket socket = server.accept();
            System.out.println("客户端一个用户登录请求");
            new Thread(new ServerRunnable(properties,socket)).start();
        }
    }
}
