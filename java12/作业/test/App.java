package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String choose ;
        ArrayList<User> list = new ArrayList<>();
        loot: while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            choose = sc.next();
            switch(choose){
                case "1"-> signIn(list);
                case "2"-> register(list);
                case "3"-> forgetPassword(list);
                case "4"->{
                    System.out.println("谢谢使用，再见");
                    break loot;
                }
                default -> System.out.println("没有这个选项，请重新选择");
            }
        }
    }
    public static void signIn(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i=0;i<3;i++) {
            String name;

            System.out.println("请输入用户名：");
            name = sc.next();
            boolean flag = contains(list,name);
            if(flag){
                System.out.println("用户名"+name+"不存在，需先注册再登陆");
                return ;
            }


            System.out.println("请输入密码：");
            String password = sc.next();
            while (true) {
                String code = getcode();
                System.out.println("验证码为 "+code);
                System.out.println("请输入验证码");
                String str = sc.next();
                if(str.equalsIgnoreCase(code)){
                    System.out.println("验证码正确");
                    break;
                }else{
                    System.out.println("验证码错误，请重新输入");
                }
            }
            User p = new User(name,password,null,null);
            flag = checkcontains(list,p);
            if(flag){
                System.out.println("登陆成功，可以使用学生管理系统了");
                Main ss = new Main();
                ss.Main();
                break;
            }else{
                System.out.println("登陆失败，用户名或密码错误");
                if(i==2){
                    System.out.println("当前账号已被锁定，请联系黑马程序员客服：xxx-xxx");
                    return ;
                }else{
                    System.out.println("用户名或密码错误，当前还有"+(2-i)+"次机会");
                }
            }
        }
    }
    public static void register(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        String name ;
        while (true) {
            System.out.println("请输入注册的用户名：");
            name = sc.next();
            boolean flag1 = checkName(name);
            if(flag1){
                System.out.println("用户名格式不符合要求，请重新输入");
                continue;
            }

            boolean flag2 = contains(list,name);
            if(flag2){
                System.out.println("用户名"+name+"可用");
                break;
            }else{
                System.out.println("用户名"+name+"已存在，请重新输入");
            }
        }
        String passWord;
        while(true){
            System.out.println("请输入注册的密码");
            passWord = sc.next();
            System.out.println("请再次输入注册的密码");
            String passWordZ = sc.next();
            if(passWord.equals(passWordZ)){
                System.out.println("两次密码一致，请录入其他数据");
                break;
            }else{
                System.out.println("两次密码不一致，请重新输入");
            }
        }
        String id;
        while(true){
            System.out.println("请输入身份证号");
            id = sc.next();
            if(id.length()!=18){
                System.out.println("身份证号格式不符合要求，请重新输入");
                continue;
            }
            if(id.charAt(0)<='0'||id.charAt(0)>'9'){
                System.out.println("身份证号格式不符合要求，请重新输入");
                continue;
            }
            boolean flag = true;
            for (int i = 1; i < id.length()-1; i++) {
                char ar = id.charAt(i);
                if(ar>'9'||ar<'0'){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                System.out.println("身份证号格式不符合要求，请重新输入");
                continue;
            }
            if(id.charAt(17)=='X'||(id.charAt(17)<='9' && id.charAt(17)>='0')||id.charAt(17)=='x'){
                System.out.println("身份证号可用，请录入其他数据");
                break;
            }
            System.out.println("身份证号格式不符合要求，请重新输入");
        }
        String phoneNumber;
        while (true) {
            System.out.println("请输入电话号码");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if(flag){
                System.out.println("电话号码已录入");
                break;
            }
            System.out.println("电话号码格式错误，请重新输入");
        }
        User p = new User(name,passWord,id,phoneNumber);
        list.add(p);
        System.out.println("账号注册成功");
       // System.out.println(list.get(0).getName());
    }
    public static void forgetPassword(ArrayList<User> list){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        boolean flag = contains(list,username);
        if(flag){
            System.out.println("用户名"+username+"不存在");
            return ;
        }
        int index = getList(list,username);
        User p = list.get(index);
        System.out.println("请输入身份证号：");
        String id = sc.next();
        System.out.println("请输入电话号");
        String phoneNumber = sc.next();
        if(!(id.equalsIgnoreCase(p.getId()))&&phoneNumber.equalsIgnoreCase(p.getPhoneNumber())){
            System.out.println("身份证号或电话号错误");
            return ;
        }
        String password;
        while(true){
            System.out.println("请输入修改的密码");
            password = sc.next();
            System.out.println("请再次输入修改的密码");
            String str = sc.next();
            if(password.equals(str)){
                System.out.println("两次输入密码一致");
                break;
            }else{
                System.out.println("两次输入密码不一致，请重新输入");
            }
        }
        p.setPassword(password);
        System.out.println("修改成功");
    }
    public static int getList(ArrayList<User> list,String name){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public static boolean checkcontains(ArrayList<User> list,User p){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(p.getName())&&list.get(i).getPassword().equals(p.getPassword())){
                return true;
            }
        }
        return false;
    }
    public static boolean checkPhoneNumber(String phoneNumber){
        if(phoneNumber.length()!=11){
            return false;
        }
        if(phoneNumber.startsWith("0")){
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char a = phoneNumber.charAt(i);
            if(a>'9'||a<'0'){
                return  false;
            }
        }
        return true;
    }

    public static boolean checkName(String name){
        int len = name.length();
        if(len>15||len<3) return true;

        for (int i = 0; i < name.length(); i++) {
            char ar = name.charAt(i);
            if(!((ar>='A'&& ar<='Z')||(ar>='a'&&ar<='z')||(ar<='9'&&ar>='0'))){
                System.out.println("1");
                return true;
            }
        }
        for (int i = 0; i < name.length() ; i++) {
            char ar = name.charAt(i);
            if((ar>='A'&& ar<='Z')||(ar>='a'&&ar<='z')){
                return false;
            }
        }
        return  true;
    }
    public static boolean contains(ArrayList<User> list,String name){
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).getName();
            if(str.equals(name)){
                return false;
            }
        }
        return true;
    }

    public static String getcode(){
        Random r = new Random();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)(i+'a'));
            list.add((char)(i+'A'));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            sb.append(list.get(index));
        }
        int index = r.nextInt(10);
        sb.append(index);
        char[] arr = sb.toString().toCharArray();
        index = r.nextInt(4);
        char ar = arr[index];
        arr[index] = arr[4];
        arr[4] = ar;
        return new String(arr);
    }

}
