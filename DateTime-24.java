import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


class DateTime_24 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        System.out.println("Default format of LocalDate=" + localDate);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd::MMM::uuuu", Locale.ENGLISH)));
        System.out.println("Default format of LocalDateTime=" + localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss", Locale.ENGLISH)));
        LocalDateTime parseTime = LocalDateTime.parse("27::Apr::2014 21::39::48", DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss",Locale.ENGLISH));
        System.out.println("Default format of Instant=" + instant);
        System.out.println(parseTime);
    }
}
