import java.util.Scanner;

class DataTypesExercises_02 {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch+" inch is "+meters+" meters");
    }
}
