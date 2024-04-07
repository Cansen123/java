package Internet.UDP组播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class U3 {
    public static void main(String[]args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1200);
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        ds.receive(dp);
        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data,0,len));
    }
}
