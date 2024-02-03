package test;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void Main(){
        Scanner sc = new Scanner(System.in);
        String choose;
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            Menu();
            choose = sc.next();
            switch(choose){
                case "1"->  addStudent(list);
                case "2"->  deleteStudent(list);
                case "3"->  updateStudent(list);
                case "4"->  quaryStudent(list);
                case "5"->  System.exit(0);
                default-> System.out.println("没有这个选项");
            }
        }

    }
    public static void Menu(){
        System.out.println("----------欢迎来到黑马学生管理系统-----------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入你的选择：");
    }

    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入id：");
            id = sc.next();
            if(contains(list,id)){
                System.out.println("id已经存在，请重新录入");
            }else{
                break;
            }
        }
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入家庭住址");
        String address = sc.next();
        Student st = new Student(id,name,age,address);
        list.add(st);
        System.out.println("学生信息添加成功");
    }
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();

        int index = getIndex(list,id);
        if(index!=-1){
            list.remove(index);
            System.out.println("id为："+id+"的学生删除成功");
        }else{
            System.out.println("id不存在，删除失败");
        }
    }
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc =new Scanner(System.in);

        System.out.println("请输入要修改的id");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index ==-1){
            System.out.println("id不存在,请重新输入");
            return ;
        }
        System.out.println("请输入要修改的姓名");
        String name = sc.next();

        System.out.println("请输入要修改的年龄");
        int age = sc.nextInt();

        System.out.println("请输入要修改的家庭住址");
        String address = sc.next();

        Student st = new Student(id,name,age,address);
        list.set(index,st);
    }
    public static void quaryStudent(ArrayList<Student> list){
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
            return ;
        }

        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId()+"\t\t"+list.get(i).getName()+"\t"+list.get(i).getAge()+"\t"+ list.get(i).getAddress());
        }
    }
    public static boolean contains(ArrayList<Student> list , String id){
        /*for(int i=0;i<list.size();i++){
            String sid = list.get(i).getId();
            if(id.equals(sid)){
                return true;
            }
        }
        return false;*/
        return getIndex(list,id) >= 0;
    }
    public static int getIndex(ArrayList<Student> list,String id){
        int index = -1;
        for(int i=0;i<list.size();i++){
            String sid = list.get(i).getId();
            if(id.equals(sid)){
                index = i;
                return index;
            }
        }
        return index;
    }
}
