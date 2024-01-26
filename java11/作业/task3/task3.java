package task3;
import java.util.ArrayList;
public class task3 {
    public static void main(String[]args){
        ArrayList<member> list = new ArrayList<member>();
        member p1 = new member("张三",3000);
        member p2 = new member("李四",3500);
        member p3 = new member("王五",4000);
        member p4 = new member("赵六",4500);
        member p5 = new member("田七",5000);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        setCheck(list,"王五","王小五");
        deleteCheck(list,"赵六");
        addSalary(list,"田七");

        for(int i=0;i<list.size();i++){
            System.out.println("姓名："+ list.get(i).getName()+", 工资："+list.get(i).getSalary());
        }
    }
    public static boolean setCheck(ArrayList<member> list, String str,String arr){
        int index =check(list,str);
        if(index!=-1){
            list.get(index).setName(arr);
            return true;
        }
        return false;
    }
    public static void addSalary(ArrayList<member> list, String str){
        int index = check(list,str);
        if(index != -1){
            int add = list.get(index).getSalary() + 500;
            list.get(index).setSalary(add);
        }
    }
    public static boolean deleteCheck(ArrayList<member> list,String str){
        int index = check(list,str);
        if(index!=-1){
            list.remove(index);
            return true;
        }
        return false;
    }

    public static int check(ArrayList<member> list, String str){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().equals(str)){
                return i;
            }
        }
        return -1;
    }


}
