package Internet.UdP;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDP1 {
    public static void main(String[]args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你想说的话：");
            String str = sc.nextLine();
            if(str.equals("886")){
                break;
            }
            byte[]bytes = str.getBytes();
            InetAddress ia = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,ia,port);
            ds.send(dp);
        }

        ds.close();
    }
}
