import java.util.Scanner;


class Numbers_17 {
    private static boolean isCircularPrimeNumbers(int num) {
        return containsOnly1379(num) && isPrime(num);
    }

    private static boolean isPrime(int x) {
        int sqx = (int) java.lang.Math.sqrt(x);
        if (x <= 3) {
            return x >= 2;
        }
        if (x % 2 == 0 || x % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= sqx; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsOnly1379(int num) {
        for (char ch : (num + "").toCharArray()) {
            if (ch == '1' || ch == '3' || ch == '7' || ch == '9') {
                continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number:");
        int num = scanner.nextInt();

        System.out.println("It is " + (isCircularPrimeNumbers(num) ? "" : "not ") + "a Circular Prime number.");
    }


}
