package task1;

public class GameTest {
    public static void main(String[] agrs){
        Role p1 = new Role("乔峰",100,'男');
        Role p2 = new Role("鸠摩智",100,'男');

        p1.showRoleInfo();
        p2.showRoleInfo();

        while(true){
            p1.attack(p2);
            if(p2.getBoold()==0){
                System.out.println(p1.getName() + " K.O了" + p2.getName());
                break;
            }
            p2.attack(p1);
            if(p1.getBoold()==0){
                System.out.println(p2.getName() + " K.O了" + p1.getName());
                break;
            }
        }
    }
}
