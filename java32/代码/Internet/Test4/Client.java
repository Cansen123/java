package Internet.Test4;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[]args) throws IOException {
        Socket s = new Socket("127.0.0.1",10009);

        FileInputStream fis = new FileInputStream("C:\\Users\\86137\\Pictures\\bh3rd\\006BFMdqgy1gh1b4itpwnj315o0ngtw0 (1).jpg");
        OutputStream os = s.getOutputStream();
        int b; byte[] bytes = new byte[1024];
        while((b=fis.read(bytes))!=-1){
            os.write(bytes,0,b);
        }
        s.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        System.out.println(str);
        s.close();
    }
}
