import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;


class DateTime_23 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        Period period = today.until(lastDayOfYear);
        System.out.println("Months remaining in the year: "+period.getMonths());
    }
}
