import java.util.Scanner;


class DataTypesExercises_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        int meters = input.nextInt();
        System.out.print("Input hour: ");
        int hours = input.nextInt();
        System.out.print("Input minutes: ");
        int minutes = input.nextInt();
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();
        float totalSeconds = hours * 60 * 60 + minutes * 60 + seconds;
        float mps = meters / totalSeconds;
        System.out.println("Your speed in meters/second is " + mps);
        float kph = ( meters/1000.0f ) / ( totalSeconds/3600.0f );
        System.out.println("Your speed in km/h is " + kph);
        float mph = kph / 1.609f;
        System.out.println("Your speed in miles/h is " + mph);
    }
}
