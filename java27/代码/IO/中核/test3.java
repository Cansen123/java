package IO.中核;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class test3 {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\java\\新建文件夹\\ccc.txt"));
        ArrayList<Student> list = new ArrayList<>();
        String str;
        while((str= br.readLine())!=null){
            String []arr = str.split("-");
            Student stu = new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();

        double weight = 0;
        for (Student stu : list) {
            weight += stu.getWeight();
        }

        double [] arr = new double[list.size()];
        for(int i=0;i<list.size();i++){
            double w = list.get(i).getWeight();
            arr[i] = w/weight;
        }

        for(int i=1;i<list.size();i++){
            arr[i] = arr[i]+arr[i-1];
        }

        double r = Math.random();
        int index = -Arrays.binarySearch(arr,r) -1;
        Student student = list.get(index);
        System.out.println(student);

        double w = student.getWeight()/2;
        student.setWeight(w);

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\新建文件夹\\ccc.txt"));
        for (Student s : list) {
            bw.write(s.getName()+"-"+s.getGender()+"-"+s.getAge()+"-"+s.getWeight());
            bw.newLine();
        }
        bw.close();
    }
}
