package task4;

public class Main {
    public static void main(String [] args){
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3,"wangwu",25);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        Student stu4 = new Student(4, "zhaoliu", 26);
        boolean flag = contains(stu4,arr);

        if(flag){
            System.out.println("当前id重复，请修改id后再进行添加");
        }else{
            int count = getCount(arr);
            if(count==arr.length){
                Student[] newArr = CreatArr(arr,stu4,count);
                printShow(newArr);
                int index = getIndex(newArr,2);
                if(index!=-1){
                    newArr[index] = null;
                    printShow(newArr);
                    index = getIndex(newArr,3);
                    if(index!=-1) {
                        int age = newArr[index].getAge() + 1;
                        newArr[index].setAge(age);
                        printShow(newArr);
                    }else{
                        System.out.println("当前id不存在，修改失败");
                    }
                }else{
                    System.out.println("当前id不存在，删除失败");
                }

            }else{
                arr[count] = stu4;
                printShow(arr);
                int index = getIndex(arr,2);
                if(index!=-1){
                    arr[index] = null;
                    printShow(arr);
                    index = getIndex(arr,3);
                    if(index !=-1){
                        int age = arr[index].getAge()+1;
                        arr[index].setAge(age);
                        printShow(arr);
                    }else{
                        System.out.println("当前id不存在，修改失败");
                    }
                }else{
                    System.out.println("当前id不存在，删除失败");
                }
            }

        }


    }
    public static int getIndex(Student[] arr,int index){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(arr[i].getId()==index){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printShow(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println(arr[i].getId() + ", " + arr[i].getName() + ", " + arr[i].getAge());
            }
        }
    }
    public static Student[] CreatArr(Student[] arr,Student stu,int count){
        Student[] newArr = new Student[count+1];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[count] = stu;
        return newArr;
    }
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= null){
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student stu,Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                if(stu.getId()==arr[i].getId()){
                    return true;
                }
            }
        }
        return false;
    }
}
