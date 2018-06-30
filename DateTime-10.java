import java.time.YearMonth;


class DateTime_10 {
    public static void main(String[] args) {
        YearMonth ym = YearMonth.of(2018, 6);
        System.out.println("First day: " + ym.atDay(1).getDayOfWeek().name());
        System.out.println("First day: " + ym.atEndOfMonth().getDayOfWeek().name());
    }
}
