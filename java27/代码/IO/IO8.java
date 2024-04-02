package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO8 {
    public static void main(String [] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("D:\\java\\code\\_01code\\_02code\\src\\IO\\afaslf");
            fos = new FileOutputStream("D:\\java\\code\\_01code\\_02code\\src\\IO\\b");
            int len;byte [] bytes = new byte[3];
            while((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }

        }catch (IOException e){

        }finally{
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {

                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
