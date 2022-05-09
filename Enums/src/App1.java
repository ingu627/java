import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class App1 {

    public static void main(String[] args) {

        Date date = new Date();
//        System.out.println(date.toString());
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2015, Calendar.JANUARY, 1);
//        Date currentDate = calendar.getTime();
//
//        System.out.println(currentDate.toString());
//
//        Calendar calendar2 = new GregorianCalendar(2019,Calendar.APRIL,10);
//        System.out.println(calendar2.getTime().toString());


//        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
//        System.out.println(dateFormat.format(date));


        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.OCTOBER, 1);
        calendar.add(Calendar.DATE, 2);
        Date date2 = calendar.getTime();
//        System.out.println(calendar.getTime().toString());

//        System.out.println(date.compareTo(date2)); // -1 : date<date2

        System.out.println(date2.before(date));

        TimeZone timeZone = TimeZone.getDefault();
        String zoneName = timeZone.getDisplayName();
        System.out.println(zoneName);
    }
}
