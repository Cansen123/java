package task1;
import java.util.Scanner;
public class test5 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int money;
        while(true){
            money = sc.nextInt();
            if(money >=0&&money<=9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }
        String moneyStr = "";
        for(int i=6;i>=0;i--){
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber+moneyStr ;
            money /=10;
        }
        String result = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for(int i=0;i<moneyStr.length();i++){
            result = result + moneyStr.charAt(i) + arr[i];
        }
        System.out.println(result);

    }
    public static String getCapitalNumber(int ge){
        String []arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[ge];
    }
}
