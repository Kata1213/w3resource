import java.time.LocalDate;
import java.time.Period;

class DateTime_19 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate diffDay = LocalDate.of(2008, 8, 8);
        Period diff = Period.between(diffDay, now);
        System.out.print("Difference between " + now + " and " + diffDay + " : ");
        System.out.println(diff.getYears() + " year(s), " + diff.getMonths() + " Month(s)");
    }
}
