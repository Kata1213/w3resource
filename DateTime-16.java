import java.util.Calendar;
import java.util.Date;


class DateTime_16 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date data = calendar.getTime();
        System.out.println("Current Date: " + data);
        calendar.add(Calendar.DAY_OF_YEAR, 14);
        Date newDate = calendar.getTime();
        System.out.println("after 2 weeks Date: " + newDate);
    }
}
