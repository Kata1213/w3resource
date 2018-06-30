import java.util.Arrays;
import java.util.Scanner;


class Numbers_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        String numString = "" + num;
        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum += Math.pow(Integer.parseInt(numString.substring(i, i + 1)), i + 1);
        }
        System.out.println(((sum == num) ? "Is " : "Not ") + "a Disarium Number.");

    }
}
