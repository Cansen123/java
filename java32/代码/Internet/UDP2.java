package Internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDP2 {
    public static void main(String []args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte [] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        ds.receive(dp);

        InetAddress address = dp.getAddress();
        int len = dp.getLength();
        byte[] data = dp.getData();
        int port = dp.getPort();

        System.out.println(address+"--------"+port);
        System.out.println(len);
        System.out.println(new String(data,0,len));
        ds.close();
    }
}
