package IO.中核;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ttest1 {
    public static void main(String[] args) throws IOException {
        String FamilyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String BoyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet=  "http://www.haoming8.cn/baobao/7641.html";

        String familyName =  HttpUtil.get(FamilyNameNet);
        String boyName = HttpUtil.get(BoyNameNet);
        String girlName = HttpUtil.get(girlNameNet);

        /*ArrayList<String> familyNameList = getDate(familyName,"([\\u4e00-\\u9fa5])(</div>)",1);
        ArrayList<String> boyList = getDate(boyName,"([\\u4e00-\\u9fa5]{2})(、|。)",1);
        ArrayList<String> girlTempList = getDate(girlName,"(.. ){4}..",0);*/
        ArrayList<String> familyNameList =(ArrayList<String>) ReUtil.findAll("([\\u4e00-\\u9fa5])(</div>)",familyName,1);
        ArrayList<String> boyList =(ArrayList<String>) ReUtil.findAll("([\\u4e00-\\u9fa5]{2})(、|。)",boyName,1);
        ArrayList<String> girlTempList =(ArrayList<String>) ReUtil.findAll("(.. ){4}..",girlName,0);
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlTempList) {
            String []arr = s.split(" ");
            Collections.addAll(girlNameList,arr);
        }

        ArrayList<String> list = getInofs(familyNameList,boyList,girlNameList,50,70);
        System.out.println(list);

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\新建文件夹\\ll.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
    public static ArrayList<String>getInofs(ArrayList<String> family,ArrayList<String>boy,ArrayList<String>girl,int boycount,int girlcount){
        HashSet<String> man = new HashSet<>();
        Random r = new Random();
        while(true){
            if(man.size()==boycount){
                break;
            }
            int age = r.nextInt(18,27);
            Collections.shuffle(family);
            Collections.shuffle(boy);
            man.add(family.get(0)+boy.get(0)+"-男-"+age);
        }
        HashSet<String> lady = new HashSet<>();
        while(true){
            if(lady.size()==girlcount){
                break;
            }
            int age = r.nextInt(18,28);
            Collections.shuffle(family) ; Collections.shuffle(girl);
            lady.add(family.get(0)+girl.get(0)+ "-女-"+age);
        }
        ArrayList<String> list = new ArrayList<>();
        for (String s : man) {
            list.add(s);
        }
        for(String s : lady){
            list.add(s);
        }
        Collections.shuffle(list);
        return list;
    }
    public static ArrayList<String> getDate(String name ,String regex, int index){
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        while(matcher.find()){
            list.add(matcher.group(index));
        }
        return list;
    }
    public static String webcrawler(String Net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(Net);
        URLConnection uc = url.openConnection();
        InputStreamReader isr = new InputStreamReader(uc.getInputStream());
        int b ;
        while((b=isr.read())!=-1){
            sb.append((char)b);
        }
        isr.close();
        return sb.toString();
    }
}
