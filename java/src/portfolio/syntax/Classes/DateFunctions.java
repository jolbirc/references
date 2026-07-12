package syntax.Classes;

import java.util.Calendar;
import java.util.Date;

public class DateFunctions
{
    public static Date makeDate (int year, int month, int day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }

    public static Date addDays (Date date, int days)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }

    public static Date thisTimeLastYear()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, -1);
        return calendar.getTime();
    }
}
