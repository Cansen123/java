package IO.中核;

import javax.print.DocFlavor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test1 {
    public static void main(String[] args) throws IOException {
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyName = webCrawler(familyNameNet);
        String boyName = webCrawler(boyNameNet);
        String girlName = webCrawler(girlNameNet );

        ArrayList<String> familyList = getDate(familyName,"([\\u4e00-\\u9fa5])(</div>)",1);
        ArrayList<String> boyList = getDate(boyName,"([\\u4e00-\\u9fa5]{2})(、|。)",1);
        ArrayList<String> girlTempList = getDate(girlName,"(.. ){4}..",0);
       // System.out.println(girlTempList);
        ArrayList<String> girlList = new ArrayList<>();
        for (String s : girlTempList) {
            String[] str = s.split(" ");
            Collections.addAll(girlList,str);
        }
        ArrayList<String> list = getInofs(familyList,boyList,girlList,50,50);
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\新建文件夹\\名录.txt"));
        for(String s : list){
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
    public static ArrayList<String> getInofs(ArrayList<String>familyList,ArrayList<String>boyList,ArrayList<String>girlList,int boycount,int girlcount){
        HashSet<String> boyset = new HashSet<>();
        while(true){
            if(boyset.size()==boycount){
                break;
            }
            Collections.shuffle(familyList);
            Collections.shuffle(boyList);
            boyset.add(familyList.get(0)+boyList.get(0));
        }
        HashSet<String> girlset = new HashSet<>();
        while(true){
            if(girlset.size()==girlcount){
                break;
            }
            Collections.shuffle(familyList);
            Collections.shuffle(girlList);
            girlset.add(familyList.get(0)+girlList.get(0));
        }
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (String s : boyset) {
            int age = r.nextInt(18,27);
            list.add(s+"-男-"+age);
        }
        for(String s : girlset){
            int age = r.nextInt(18,27);
            list.add(s+"-女-"+ age);
        }
       // System.out.println(1);
        Collections.shuffle(list);
        return list;
    }

    public static ArrayList<String>getDate(String name ,String regex, int index){
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        while(matcher.find()){
            list.add(matcher.group(index));
        }
        return list;
    }
   /* public static ArrayList<String> getDate(String name,String regex,int index){
        ArrayList<String> list = new ArrayList<>();
        Pattern patern = Pattern.compile(regex);
        Matcher matcher = patern.matcher(name);
        while(matcher.find()){
            list.add(matcher.group(index));
        }
        return list;
    }*/



    public static String webCrawler (String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);
        URLConnection uc = url.openConnection();
        InputStreamReader isr = new InputStreamReader(uc.getInputStream());
        int b ;
        while((b=isr.read())!=-1){
            sb.append((char)b);
        }
        isr.close();
        return sb.toString();
    }


    /*public static String webCrawler(String net) throws IOException {
        StringBuilder str = new StringBuilder();
        URL url = new URL(net);
        URLConnection uc = url.openConnection();
        InputStreamReader isr = new InputStreamReader(uc.getInputStream());
        int b ;
        while((b=isr.read())!=-1){
            str.append((char)b);
        }
        System.out.println(str);
        return str.toString();
    }*/
}
