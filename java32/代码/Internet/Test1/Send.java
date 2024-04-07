package Internet.Test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Send {
    public static void main(String[]args) throws IOException {
        Socket s = new Socket("127.0.0.1",10009);
        OutputStream os = s.getOutputStream();
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = sc.nextLine();
            if(str.equals("886")){
                break;
            }
            os.write(str.getBytes());
        }


        s.close();
    }
}
