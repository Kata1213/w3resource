import java.util.Scanner;


class Numbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.println(Numbers_9.isHappyNum(num)?"H":"Unh"+"appy Number");
    }
}
