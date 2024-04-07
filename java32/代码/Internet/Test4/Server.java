package Internet.Test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[]args) throws IOException {
        ServerSocket ss = new ServerSocket(10009);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,12,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        while (true) {
            Socket s = ss.accept();
            pool.submit(new MyThread(s));
        }

    }
}
