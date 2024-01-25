package task1;

public class test7 {
    public static void main(String[] args){
        String id = "321281202001011234";

        String year = id.substring(7,11);
        String month = id.substring(11,13);
        String day = id.substring(13,15);

        char gender = id.charAt(16);
        if((gender - '0')%2==0){
            gender = '女';
        }else{
            gender = '男';
        }

        System.out.println("人物信息为：");
        System.out.println("出生年月日:" + year + "年" + month + "月" + day + "日");

        System.out.println("性别为:"+gender);
    }
}
