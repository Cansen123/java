package IO;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IO28 {
    public static void main(String[] args) throws IOException {
        File files = FileUtil.file("D:\\", "java", "新建文件夹", "kkk","copy.txt");
        //System.out.println(files);
        //File touch = FileUtil.touch(files);
        //System.out.println(touch);
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd","fff");
        //FileUtil.writeLines(list,files,"UTF-8");
      //  FileUtil.appendLines(list,files,"UTF-8");
        //List<String> s = FileUtil.readLines(files, "UTF-8");
       // System.out.println(s);
        List<String> t = FileUtil.readUtf8Lines(files);
        System.out.println(t);
        FileUtils.copyFile(files,new File("D:\\java\\新建文件夹\\p.txt"));
    }
}
