
class Numbers_23 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isNarcissisticNumber(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isNarcissisticNumber(int num) {
        int len = (num + "").length();
        int originalNum = num;
        long sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, len);
            num /= 10;
        }
        return sum == originalNum;
    }
}
