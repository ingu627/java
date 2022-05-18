import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class App2 {

    public static void main(String[] args) {

        //Current Date and TIme
        System.out.println("Current Date: "+ LocalDate.now());
        System.out.println("Current Time: "+ LocalTime.now());
        System.out.println("Current Date & Time: "+ LocalDateTime.now());

        //Creating Dates and Time
        LocalDate dateA = LocalDate.of(2020, Month.MARCH, 15);
        //do the exact same thing
        LocalDate dateB = LocalDate.of(2020,3, 15);
        //invalid date definition throws DateTimeException
        //LocalDate dateC = LocalDate.of(2015, Month.MARCH, 32);
        System.out.println("dateA: "+dateA+ ", dateA: "+dateB);

        //we can define time - or (9, 33, 10), or (9, 33, 10, 300) = (hour, minute, seconds, nanoseconds)
        LocalTime time = LocalTime.of(9, 38);
        System.out.println("time: "+time);

        //date & time: we can separate date and time
        LocalDateTime dateTime = LocalDateTime.of(2020, Month.MARCH, 15, 9, 33);
        //(year, month, dayOfMonth, hour, minute) but you can add seconds, nanoseconds at the ends if you need
        LocalDateTime dateTime2 = LocalDateTime.of(dateA, time);
        System.out.println("dateTime: "+dateTime);
        System.out.println("dateTime2: "+dateTime2);


        /*
        Date and Time Formatting

        DateTimeFormatter: Formatter for printing and parsing date-time objects.
        ofLocalizedDate: This returns a formatter that will format or parse a date.
        The exact format pattern used varies by locale.

        ofLocalized methods
                                localDate                 localDateTime             localTime
    ofLocalizedDate           show whole object         shows just date part      Throws runtime exception
    ofLocalizedDateTIme     Throws runtime exception    shows whole object        Throws runtime exception
    ofLocalizedTIme         Throws runtime exception    shows just time part      shows whole object
         */

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time1 = LocalTime.of(11,12,34);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);

        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); // FULL, LONG, MEDIUM, SHORT
        DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
//        System.out.println(time.format(shortDateTime));

        /*
        Manipulating Dates and Times
         */

        LocalDate mDate = LocalDate.of(2021, Month.JULY, 04);
        System.out.println(mDate);
        mDate = mDate.plusDays(12); // plus, minus, Days, Weeks, Months, Years, etc
        System.out.println(mDate);
        mDate = mDate.withYear(2019); // Year, Month, etc.
        System.out.println(mDate);

        LocalDate m2Date = LocalDate.of(2020, Month.DECEMBER, 01);
        LocalTime m2Time = LocalTime.of(11, 18);
        System.out.println("Before: "+LocalDateTime.of(m2Date, m2Time));
        // date and time method chaining
        LocalDateTime m2DateTime = LocalDateTime.of(m2Date, m2Time).minusDays(1).minusHours(11);
        System.out.println("After: "+ m2DateTime);





    }
}
