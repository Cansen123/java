package Internet.Test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Receive {
    public static void main(String[]args) throws IOException {
        ServerSocket ss = new ServerSocket(10009);
        Socket s = ss.accept();


        InputStream is = s.getInputStream();
        String name = UUID.randomUUID().toString();
        FileOutputStream fos = new FileOutputStream("_02code\\src\\Internet\\imge\\"+name+".jpg");
        int b ; byte[] bytes = new byte[1024];
        while((b=is.read(bytes))!=-1){
            fos.write(bytes,0,b);
        }
        s.shutdownInput();
        fos.close();

        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write("返回信息");
        bw.flush();
        s.close();
    }
}
