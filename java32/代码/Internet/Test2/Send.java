package Internet.Test2;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Send {
    public static void main(String[]args) throws IOException {
        Socket s = new Socket("127.0.0.1",10008);
        OutputStream os = s.getOutputStream();
        String str = "你好";
        os.write(str.getBytes());

       s.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        str = br.readLine();
        System.out.println(str);
        s.close();
    }
}
