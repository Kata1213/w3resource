import java.time.Year;


class DateTime_25 {
    public static void main(String[] args) {
        Year year = Year.now();
        System.out.println("Current Year: " + year);
        System.out.println("Is current year leap year? " + year.isLeap());
        System.out.println("Length of the year: " + year.length());
    }
}
