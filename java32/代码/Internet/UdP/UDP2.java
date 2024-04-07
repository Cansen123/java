package Internet.UdP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP2 {
    public static void main(String[]args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[]bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        while (true) {
            ds.receive(dp);
            byte[] data = dp.getData();
            int len = dp.getLength();
            InetAddress address = dp.getAddress();
            String ip = address.getHostAddress();
            String name = address.getHostName();
            System.out.println("主机名"+name+" 地址为"+ip+" 发送消息:"+new String(data,0,len));
        }


    }
}
