import java.util.Scanner;


class Numbers_12 {
    private static boolean isHarshadNum(int num) {
        String stringNum = num + "";
        int sum = 0;
        for (int i = 0; i < stringNum.length(); i++) {
            sum += Integer.parseInt(stringNum.substring(i,i+1));
        }
        return num % sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");

        int num = scanner.nextInt();

        System.out.println(num + " is " + (isHarshadNum(num) ? "": "not ") + "a Harshad Number.");
    }
}
