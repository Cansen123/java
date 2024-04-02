package IO;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IO25 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\java\\新建文件夹\\aa.txt");
        File dest = new File("D:\\java\\新建文件夹");

        tozip(src,dest);

    }
    public static void tozip (File src , File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"aa.zip")));
        ZipEntry ze = new ZipEntry("aa.txt");
        zos.putNextEntry(ze);
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b=fis.read())!=-1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }


    /*public static void tozip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"aa.zip")));
        ZipEntry ze = new ZipEntry("aa.txt");
        zos.putNextEntry(ze);
        int b ;
        FileInputStream fis = new FileInputStream(src);
        while((b = fis.read())!=-1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }*/
}
