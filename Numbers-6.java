import java.util.Arrays;


class Numbers_6 {
    private static boolean isNarcissisticNumber(int num) {
        String str = String.valueOf(num);
        long sum = 0;
        for (String s : str.split("")) {
            sum += Math.pow(Long.parseLong(s), str.length());
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        while (count < 15) {
            if (isNarcissisticNumber(i)) {
                System.out.printf(i + " ");
                count++;
            }
            i++;
        }
    }
}
