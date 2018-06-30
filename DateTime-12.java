import java.text.DateFormatSymbols;
import java.util.Locale;


class DateTime_12 {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("zh"));
        String[] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.println(s);
        }

    }
}
