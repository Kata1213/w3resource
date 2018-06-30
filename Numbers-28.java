import java.util.stream.Stream;


class Numbers_28 {
    private static boolean isHamming(int num) {
        if (num == 1) return true;
        if (num % 2 == 0) return isHamming(num / 2);
        if (num % 3 == 0) return isHamming(num / 3);
        if (num % 5 == 0) return isHamming(num / 5);
        return false;
    }

    public static void main(String[] args) {
        System.out.print("First Twenty Hamming numbers:");
        Stream.iterate(1, n -> n + 1)
                .filter(item->isHamming(item)).limit(20)
                .forEach(item -> System.out.print(item + " "));
    }
}
