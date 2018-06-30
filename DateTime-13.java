import java.util.Calendar;


class DateTime_13 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(8012, 11, 11);
        System.out.println("day of the week: " + cal.get(Calendar.DAY_OF_WEEK));
    }
}
