
class Numbers_8 {
    public static void main(String[] args) {
        int[] catalans = new int[11];
        catalans[0] = 1;
        for (int i = 1; i < 11; i++) {
            catalans[i] = 0;
            for (int j = 0; j < i; j++) {
                catalans[i] += (catalans[j] * catalans[i - 1 - j]);
            }
            System.out.println(catalans[i]);
        }
    }
}
