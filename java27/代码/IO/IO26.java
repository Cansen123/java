package IO;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IO26 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\java\\新建文件夹\\练习");
        File destParent = new File("D:\\java\\新建文件夹");
        File dest = new File(destParent, src.getName()+".zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        tozip(src,zos,src.getName());
        zos.close();
    }
    public static void tozip(File src , ZipOutputStream zos, String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                tozip(file,zos,name+ "\\"+ file.getName());
            }else{
                ZipEntry ze = new ZipEntry(name+"\\"+ file.getName());
                zos.putNextEntry(ze);
                FileInputStream fis = new FileInputStream(file);
                int b ;
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close(); zos.closeEntry();
            }
        }
    }
}
