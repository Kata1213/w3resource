
class DateTime_18 {
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void main(String[] args) {
        System.out.println("2008 is " + (isLeapYear(2008)?"":"not ") + "a leap year");
    }
}
