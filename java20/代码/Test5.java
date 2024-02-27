package Next;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    public static void main(String []args){
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);

        LocalDate day2 = LocalDate.of(2000,3,1);
        LocalDate dd = day2.minusDays(1);
        int day3 = dd.getDayOfMonth();
        System.out.println(day3);

        System.out.println(dd.isLeapYear());

    }
}
