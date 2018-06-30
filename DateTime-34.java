import java.util.Calendar;
import java.util.GregorianCalendar;


class DateTime_34 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 2);
        cal.set(Calendar.SECOND, 5);
        System.out.println(cal.getTime());
    }
}
