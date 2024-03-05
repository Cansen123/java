package task1;
import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String [] args){
        GirlFirend p1 = new GirlFirend("xss",17,185.5);
        GirlFirend p2 = new GirlFirend("xqq",17,185.5);
        GirlFirend p3 = new GirlFirend("xdd",19,178.8);
        GirlFirend p4 = new GirlFirend("xaa", 20,180.1);

        GirlFirend[] list = {p1,p2,p3,p4};

        Arrays.sort(list, new Comparator<GirlFirend>() {
            @Override
            public int compare(GirlFirend o1, GirlFirend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp ==0? o1.getHeight()-o2.getHeight() : temp;
                temp = temp == 0? o1.getName().compareTo(o2.getName()):temp;

                if (temp>0){
                    return 1;
                }else if(temp ==0){
                    return 0;
                }else {
                    return -1;
                }


            }
        });
        System.out.println(Arrays.toString(list));
    }
}
