import java.util.Scanner;


class Numbers_22 {
    private static boolean isMersenneNumber(int num) {
        for (int i = 0; ; i++) {
            int power = (int) Math.pow(2, i);
            if (power > num + 1) {
                return false;
            }
            if (power == num + 1) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = scanner.nextInt();

        System.out.println(num + " is " + (isMersenneNumber(num) ? "" : "not ") + "a Mersenne number.");
    }
}
