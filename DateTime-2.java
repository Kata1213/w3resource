import java.util.Calendar;


class DateTime_2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Day: " + calendar.get(Calendar.DATE));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
    }
}
