package Next;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[]args) throws ParseException {
        String str = "2000年1月1日";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf1.parse(str);
        long birthday = date.getTime();
        long now = System.currentTimeMillis();
        long time = now - birthday;
        System.out.println(time/1000/60/60/24);


        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2000,1,1);

        long day = ChronoUnit.DAYS.between(d2,d1);
        System.out.println(day);
    }
}
