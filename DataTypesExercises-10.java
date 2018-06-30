import java.util.Arrays;
import java.util.Scanner;


class DataTypesExercises_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int num = input.nextInt();
        String str = String.valueOf(num);
        String result = str.substring(0, 1);
        for (int i = 1; i < str.length(); i++) {
            result += " " + str.substring(i, i + 1);
        }
        System.out.println(result);
    }
}
