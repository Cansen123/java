package task8;

public class task8 {
    public static void main(String[]args){
        String arr = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String brr = "Java";

        int count = CountStr(arr,brr);
        System.out.println("子串共出现了"+count+"次");
    }
    public static int CountStr(String arr, String brr){
        int count = 0;
        int site ;
        while(true){
            site = arr.indexOf(brr);
            if(site==-1){
                break;
            }else{
                count++;
                arr = arr.substring(site+brr.length());
            }
        }
        return count;
    }
}
