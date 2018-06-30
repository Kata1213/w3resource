import java.text.SimpleDateFormat;
import java.util.Calendar;


class DateTime_6 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yy HH:mm:ss.SSS");
        System.out.println("Current full date and time is : "+simpleDateFormat.format(now.getTime()) );
    }
}
