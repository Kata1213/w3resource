import java.time.LocalTime;


class DateTime_27 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(11, 5, 22);
        System.out.println("Current Local time:" + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}
