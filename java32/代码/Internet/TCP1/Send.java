package Internet.TCP1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Send {
    public static void main(String[]args) throws IOException {
        Socket s = new Socket("127.0.0.1",10009);
        OutputStream os = s.getOutputStream();
        os.write("你好你好".getBytes());
        os.close();
        s.close();
    }
}
