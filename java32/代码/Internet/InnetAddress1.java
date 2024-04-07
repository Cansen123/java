package Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InnetAddress1 {
    public static void main(String[]args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("DESKTOP-JA290PF");
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }
}
