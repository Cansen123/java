package IO;

import java.io.*;

public class IO12 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\java\\新建文件夹\\练习");
        File f2 = new File("D:\\java\\新建文件夹\\copy");
        f2.mkdirs();

        copys(f1,f2);

    }

    public static void copys(File f1,File f2) throws IOException {
        File [] files = f1.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileReader fr = new FileReader(file);
                File fww = new File(f2,file.getName());
                FileWriter fw = new FileWriter(fww);
                char [] arr = new char[100];
                int len = 0;
                while((len =fr.read(arr))!=-1){
                    fw.write(arr,0,len);
                }
                fr.close(); fw.close();

            }else{
                File fw = new File(f2,file.getName());
                fw.mkdirs();
                copys(file,fw);
            }

        }



    }
}
