import java.util.Scanner;


class DataTypesExercises_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        long offset = input.nextInt();
        long seconds = System.currentTimeMillis() / 1000;
        long currentSecond = seconds % 60;
        long minutes = seconds / 60;
        long currentMinute = minutes % 60;
        long hours = minutes / 60;
        long currentHour = ((hours + offset) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
