package Internet.Test2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
    public static void main(String[]args) throws IOException {
        ServerSocket ss = new ServerSocket(10008);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        System.out.println(str);

        s.shutdownInput();


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write("返回信息");
        bw.close();
        s.close();
        ss.close();
    }
}
