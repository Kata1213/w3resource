import java.util.Calendar;


class DateTime_11 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("The number of days of a month:"
                + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
