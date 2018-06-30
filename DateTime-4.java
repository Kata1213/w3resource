import java.util.Calendar;


class DateTime_4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println("min year: " + calendar.getActualMinimum(Calendar.YEAR));
        System.out.println("min month: " + calendar.getActualMinimum(Calendar.MONTH));
        System.out.println("min week: " + calendar.getActualMinimum(Calendar.WEEK_OF_YEAR));
        System.out.println("min date: " + calendar.getActualMinimum(Calendar.DATE));
    }
}
