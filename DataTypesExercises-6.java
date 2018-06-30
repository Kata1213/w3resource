import java.util.Scanner;


class DataTypesExercises_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble() * 0.45359237;
        System.out.print("Input height in inches: ");
        double height = input.nextDouble();
        double BMI = weight / (height * 0.0254 * height * 0.0254);
        System.out.println("Body Mass Index is "+ BMI);
    }
}
