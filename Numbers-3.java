import java.util.Scanner;


class Numbers_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Input the end of the range: ");
        int end = scanner.nextInt();
        int random = start + (int)(Math.random() * ((end - start) + 1));
        System.out.print("the random num is " + random);
    }
}
