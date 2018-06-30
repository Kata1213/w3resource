import java.util.Scanner;


class DataTypesExercises_03 {
    public static void main(String[] args) {
        int num = -1;
        while (num < 0 || num > 1000) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input an integer between 0 and 1000: ");
            num = input.nextInt();
        }
        String numStr = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            sum += Integer.parseInt(numStr.substring(i, i + 1));
        }
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}
