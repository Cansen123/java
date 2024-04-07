package Internet.UDP组播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class R2 {
    public static void main(String[]args) throws IOException {
        MulticastSocket ms = new MulticastSocket(1200);
        byte[]bytes = new byte[1024];
        InetAddress ia = InetAddress.getByName("224.0.0.2");
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ms.joinGroup(ia);
        ms.receive(dp);
        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data,0,len));
        ms.close();
    }
}
