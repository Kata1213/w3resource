import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class Numbers_26 {
    private static boolean isKeith(int num) {
        String str = num + "";
        int sum = 0;
        List<Integer> numList = new ArrayList<>();
        Arrays.stream(str.split(""))
                .mapToInt(Integer::parseInt)
                .forEach(item -> numList.add(item));
        while (sum < num) {
            sum = numList.stream()
                    .skip(numList.size() - str.length()).limit(str.length())
                    .reduce(0, Integer::sum);
            numList.add(sum);
            if (num == sum) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.println((isKeith(num) ? "" : "Not ") + "Keith Number");
    }
}
