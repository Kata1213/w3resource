import java.util.Scanner;


class Numbers_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        String stringNum = scanner.next();
        System.out.println(((stringNum.indexOf("0") > 0) ? "" : "Not ") + "Duck number");
    }
}
