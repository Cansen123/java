package IO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class IO27 {
    public static void main(String[] args) throws IOException {
        File src1 = new File("D:\\java\\新建文件夹\\ll.txt");
        File dest1 = new File("D:\\java\\新建文件夹\\copy.txt");
        //FileUtils.copyFile(src1,dest1);
        File src2 = new File("D:\\java\\新建文件夹\\aaa");
        File dest2 = new File ("D:\\java\\新建文件夹\\ff");
        //FileUtils.copyDirectory(src2,dest2);
        File src3 = new File("D:\\java\\新建文件夹\\aaa");
        File dest3 = new File("D:\\java\\新建文件夹\\ggg");
       // FileUtils.copyDirectoryToDirectory(src3,dest3);
        File src4 = new File("D:\\java\\新建文件夹\\ggg");
       // FileUtils.deleteDirectory(src4);
        File src5= new File("D:\\java\\新建文件夹\\ff");
       // FileUtils.cleanDirectory(src5);
        File src6 = new File("D:\\java\\新建文件夹\\ll.txt");
        //String str = FileUtils.readFileToString(src6,"UTF-8");
        //System.out.println(str);
        FileUtils.write(src6,"我早你妈\r\n帆帆帆帆","UTF-8");

    }
}
