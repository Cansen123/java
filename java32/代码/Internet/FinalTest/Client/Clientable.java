package Internet.FinalTest.Client;

import java.io.BufferedReader;
import java.io.IOException;

public class Clientable implements Runnable{
    BufferedReader br ;
    public Clientable(BufferedReader br){
        this.br = br;
    }
    @Override
    public void run() {
        while (true) {
            try {
                String str = br.readLine();
                System.out.println(str);
                System.out.println("请发出你想说的话：");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
