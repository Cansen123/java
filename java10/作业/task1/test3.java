package task1;

public class test3 {
    public static void main(String[] args){
        int[] arr = {1,2,3};

        String str = arrTostring(arr);
        System.out.println(str);
    }
    public static String arrTostring(int []arr){
        String s = "";
        if(arr==null){
            return "";
        }
        if(arr.length==0){
            return "[]";
        }
        s = s+"[";
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                s = s+arr[i]+", ";
            }else{
                s = s +arr[i] + "]";
            }
        }
        return s;
    }
}
