package IO;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class IO24 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\java\\新建文件夹\\aaa.zip");
        File copy = new File ("D:\\java\\新建文件夹");

        upzip(src,copy);
    }

    public static void upzip(File src , File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry nextEntry ;
        while((nextEntry = zis.getNextEntry())!=null){
            System.out.println(nextEntry);
            if(nextEntry.isDirectory()){
                File files = new File(dest,nextEntry.toString());
                files.mkdirs();
            }else{
                File files = new File(dest,nextEntry.toString());
                FileOutputStream fos = new FileOutputStream(files);
                int b;
                while((b = zis.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();
            }

        }
        zis.close();

    }


   /*public static void upzip (File src,File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));

        ZipEntry ze ;
        while((ze= zis.getNextEntry())!=null){
            if(ze.isDirectory()){
                File file = new File(dest,ze.toString()) ;
                file.mkdirs();
            }else{
                File file = new File(dest,ze.toString());
                FileOutputStream fos = new FileOutputStream(file);
                int t ;
                while((t=zis.read())!=-1){
                    fos.write(t);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }*/
}
