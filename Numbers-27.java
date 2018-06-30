import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


class Numbers_27 {
    private static boolean isCircularPrime(long num) {
        for (int i = ("" + num).length(); i > 0; i--) {
            if (!isPrime(Rotate(num, i))) {
                return false;
            } else {
                System.out.println(Rotate(num, i));
            }
        }
        return true;
    }

    private static boolean isPrime(long num) {
        if (num < 2) return false;
        else if (num == 2) return true;
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int Rotate(long num,int distance) {
        String str = String.valueOf(num);
        List<String> numList= Arrays.stream(str.split("")).collect(Collectors.toList());
        Collections.rotate(numList, distance);
        return Integer.parseInt(numList.stream().reduce("", String::concat));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        String result = isCircularPrime(num) ? " is a circular_num Prime number." : " is not a circular_num Prime number.";
        System.out.println(num + result);
    }
}
