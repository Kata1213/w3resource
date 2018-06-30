import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class DateTime_35 {
    public static void main(String[] args) throws ParseException {
        String dateString = "2008-8-8 8:8:8";
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
        String newDate = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
        System.out.println(newDate);
    }
}
