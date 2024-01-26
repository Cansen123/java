package task4;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        loop: while (true) {
            Menu();
            System.out.println("请输入你的选择：");
            String choose = sc.next();
            switch(choose){
                case "1"->addBook(list);
                case "2"->quaryBook(list);
                case "3"->quaryABook(list);
                case "4"->deleteBook(list);
                case "5"->updateBook(list);
                case "6"->{break loop;}
                default -> System.out.println("没有该选项，请重新输入");
            }
        }
    }
    //System.out.println("图书\t\t书名\t\t作者\t\t价格");
    public static void Menu(){
        System.out.println("-----------------------欢迎来的图书管理系统------------------");
        System.out.println("1，添加图书信息");
        System.out.println("2，查询所有图书信息");
        System.out.println("3，查询单本图书信息");
        System.out.println("4，删除图书信息");
        System.out.println("5，修改图书信息");
        System.out.println("6，退出");
    }
    public static void addBook(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        String id;
        while(true){
            System.out.println("请输入图书的编号");
            id = sc.next();
            if(contains(list,id)){
                System.out.println("该编号已经存在，请重新输入图书编号");
            }else{
                break;
            }
        }
        System.out.println("请输入图书的书名");
        String name = sc.next();
        System.out.println("请输入图书的作者");
        String author = sc.next();
        System.out.println("请输入图书的价格");
        String price = sc.next();
        Book p = new Book(id,name,author,price);
        list.add(p);
        System.out.println("添加图书信息成功");

    }
    public static void deleteBook(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的图书的编号");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index==-1){
            System.out.println("没有该编号，删除失败，请重新输入");
            return ;
        }
        list.remove(index);
        System.out.println("删除成功");

    }
    public static void quaryBook(ArrayList<Book> list){
        if(list.size()==0){
            System.out.println("当前无图书信息，请稍后再查询");
            return ;
        }
        System.out.println("编号\t\t书名\t\t作者\t\t价格");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getId()+"\t\t"+list.get(i).getName()+"\t\t"+list.get(i).getAuthor()+"\t"+list.get(i).getPrice());
        }
    }
    public static void quaryABook(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的图书的书名:");
        String name = sc.next();
        int index = getNIndex(list,name);
        if(index==-1){
            System.out.println("无该书名的图书信息，请重新输入");
            return;
        }
        System.out.println("编号\t\t书名\t\t作者\t\t价格");
        System.out.println(list.get(index).getId()+"\t\t"+list.get(index).getName()+"\t\t"+list.get(index).getAuthor()+"\t"+list.get(index).getPrice());

    }
    public static void updateBook(ArrayList<Book> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改图书信息的编号");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index==-1){
            System.out.println("没有该编号，修改失败，请重新输入");
            return ;
        }
        System.out.println("请输入图书的书名");
        String name = sc.next();
        System.out.println("请输入图书的作者");
        String author = sc.next();
        System.out.println("请输入图书的价格");
        String price = sc.next();
        Book p = new Book(id,name,author,price);
        list.set(index,p);
        System.out.println("修改成功");
    }
    public static boolean contains(ArrayList<Book> list,String id){
        return getIndex(list,id)>=0;
    }
    public static int getIndex(ArrayList<Book> list ,String id){
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).getId();
            if(str.equals(id)){
                return i;
            }
        }
        return -1;
    }
    public static int getNIndex(ArrayList<Book> list,String name){
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).getName();
            if(str.equals(name)){
                return i;
            }
        }
        return -1;
    }
}
