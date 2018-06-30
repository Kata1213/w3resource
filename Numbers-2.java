import java.util.stream.IntStream;


class Numbers_2 {

    private static int positiveDivisorsSum(int num) {
        return IntStream.rangeClosed(1, (num + 1) / 2).filter(i -> num % i == 0 && i != num).sum();
    }

    public static void main(String[] args) {
        int countDeficient = 0;
        int countPerfect = 0;
        int countAbundant = 0;
        for (int i = 1; i <= 10000; i++) {
            int sum = positiveDivisorsSum(i);
            if (i == sum) {
                countPerfect++;
            } else if (i > sum) {
                countDeficient++;
            } else {
                countAbundant++;
            }
        }
        System.out.println("Deficient number: " + countDeficient);
        System.out.println("Perfect number: " + countPerfect);
        System.out.println("Abundant number: " + countAbundant);
    }
}
