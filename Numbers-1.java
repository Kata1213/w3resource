import java.util.Scanner;


class Numbers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while (num < 0) {
            System.out.print("Input an integer number: ");
            num = scanner.nextInt();
        }
        System.out.println("It is " +
                (isUgly(num) ? "" : "not ") +
                "an ugly number.");
    }

    private static boolean isUgly(int num) {
        if (num > 1) {
            while (num % 2 == 0) {
                num /= 2;
            }
            while (num % 3 == 0) {
                num /= 3;
            }
            while (num % 5 == 0) {
                num /= 5;
            }
        }
        return num == 1;
    }
}
