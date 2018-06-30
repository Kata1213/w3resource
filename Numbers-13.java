import java.util.Scanner;


class Numbers_13 {
    private static boolean isPronicNumbers(int num) {
        int n = (int) Math.sqrt(num);

        return n * (n + 1) == num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");

        int num = scanner.nextInt();

        System.out.println((isPronicNumbers(num) ? "" : "Not ") + "Pronic Number.");
    }
}
