import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


class DateTime_9 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONTH);
        System.out.println(dateFormat.format(calendar.getTime()));
        calendar.add(Calendar.DAY_OF_WEEK, 6);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
