package task1;

public class test10 {
    public static void main(String[]args){
        String arr = "abcde";
        String brr = "cdeab";

        boolean flag = check(arr,brr);

        System.out.println(flag);
    }

    public static String rotate(String str){
        char c = str.charAt(0);
        String end = str.substring(1);
        str = end + c;
        return str;
    }
    public static boolean check(String arr,String brr){
        for(int i=0;i<arr.length();i++){
            arr = rotate(arr);
            if(brr.equals(arr)){
                return true;
            }
        }
        return false;
    }
}
