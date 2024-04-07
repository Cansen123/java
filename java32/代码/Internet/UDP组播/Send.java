package Internet.UDP组播;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[]args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String str = "你好你好";
        byte[] bytes = str.getBytes();
        InetAddress ia = InetAddress.getByName("255.255.255.255");
        DatagramPacket dp = new DatagramPacket(bytes ,bytes.length,ia,1200);
        ds.send(dp);
        ds.close();
    }

}
