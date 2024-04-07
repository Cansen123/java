package Internet.FinalTest.Server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;


public class ServerRunnable implements Runnable{
    Properties properties ;
    Socket socket ;
    public ServerRunnable(Properties por , Socket socket){
        this.properties = por;
        this.socket = socket ;
    }
    @Override
    public void run() {
        BufferedReader br = null;BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                String preference = br.readLine();
                if (preference.charAt(0)=='1') {
                    login(br, bw);
                    Serve.list.add(socket);
                    TalkAll(br,bw);
                } else {
                    register(bw,br);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void register (BufferedWriter bw ,BufferedReader br) throws IOException {
        String username = br.readLine();
        String password = br.readLine();
        if(!username.matches("[a-zA-Z]{6,18}")){
            bw.write("用户名不符合格式");
            bw.newLine();
            bw.flush();
            return;
        }
        if(!password.matches("[a-zA-Z]\\d{2,7}")){
            bw.write("密码不符合格式");
            bw.newLine();
            bw.flush();
            return ;
        }
        bw.write("注册成功");
        bw.newLine();
        bw.flush();
        properties.put(username,password);
        properties.store(new FileOutputStream("_02code\\src\\Internet\\FinalTest\\user.txt"),"pdddjj");


    }
    private void TalkAll(BufferedReader br,BufferedWriter bw) throws IOException {
        while (true) {
            String str = br.readLine();
            for (Socket socket : Serve.list) {
                BufferedWriter bww = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bww.write(str);
                bww.newLine();
                bww.flush();
            }
        }
    }
    private void login(BufferedReader br, BufferedWriter bw) throws IOException {
        String username = br.readLine();
        String password = br.readLine();
        if(properties.containsKey(username)){
            if(properties.get(username).equals(password)){
                bw.write("1");
                bw.newLine();
                bw.flush();

            }else{
                bw.write("3");
                bw.newLine();
                bw.flush();
            }
        }else{
            bw.write("2");
            bw.newLine();
            bw.flush();
        }
    }
}
