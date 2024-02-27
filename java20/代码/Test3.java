package Next;
public class Test3 {
    public static void main(String[]args){
        System.out.println(toBinaryString(123));
        System.out.println(Integer.toBinaryString(123));
    }

    public static String toBinaryString(int str){
        StringBuilder arr = new StringBuilder();
        while(str!=0){
            int aa = str%2;
            arr.insert(0,aa);
            str /= 2;

        }
        return arr.toString();
    }
}
