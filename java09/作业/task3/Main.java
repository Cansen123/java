package task3;

public class Main {
    public static void main(String [] args){
        GirlFriend[] arr = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("小诗诗",18,"萌妹子","吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹",19,"萌妹子","玩游戏");
        GirlFriend gf3 = new GirlFriend("小惠惠",20,"萌妹子","看书，学习");
        GirlFriend gf4 = new GirlFriend("小莉莉",21,"憨妹子","睡觉");
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getAge();
        }
        double average = sum*1.0/arr.length;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()< average){
                count++;
                System.out.println(arr[i].getName() + ", " + arr[i].getAge() + ", " + arr[i].getGender() + ", " + arr[i].getHobby());
            }
        }
        System.out.println(count + "个");

    }
}
