import java.util.Scanner;


class DataTypesExercises_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double length = in.nextDouble();
        System.out.printf("Square: %12.2f\n", length * length);
        System.out.printf("Cube: %14.2f\n", length * length * length);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(length, 4));
    }
}
