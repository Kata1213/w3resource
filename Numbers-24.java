import java.util.Scanner;


class Numbers_24 {
    private static boolean isPalindromeNumber(int num) {
        return new StringBuffer(String.valueOf(num)).reverse().toString().equals(String.valueOf(num));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.println("It is " + (isPalindromeNumber(num) ? "" : "not ") + "a Palindrome numbers.");
    }

}
