package Internet.Test4;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyThread implements Runnable{
    Socket s ;
    public MyThread(Socket socket){
        s = socket;
    }

    @Override
    public void run() {

        try {
            InputStream is = s.getInputStream();
            String name = UUID.randomUUID().toString();
            FileOutputStream fos = new FileOutputStream("_02code\\src\\Internet\\imge\\"+name+".jpg");
            int b ;
            byte[] bytes = new byte[1024];
            while((b=is.read(bytes))!=-1){
                fos.write(bytes,0,b);
            }
            s.shutdownInput();
            fos.close();
            BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write("返回信息");
            bw.flush();
            s.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
