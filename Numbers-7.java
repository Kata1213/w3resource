import java.util.Arrays;


class Numbers_7 {
    public static void main(String[] args) {
        int[] lucasNum = new int[10];
        lucasNum[0] = 2;
        lucasNum[1] = 1;
        for (int i = 2; i < 10; i++) {
            lucasNum[i] = lucasNum[i - 1] + lucasNum[i - 2];
        }
        System.out.print("First ten Lucas a numbers:");
        Arrays.stream(lucasNum).forEach(n -> System.out.print(" " + n));


    }
}
