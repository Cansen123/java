package Internet.Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
    public static void main(String [] args) throws IOException {
        ServerSocket ss = new ServerSocket(10009);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        System.out.println(str);
        s.close();
        ss.close();
    }
}
