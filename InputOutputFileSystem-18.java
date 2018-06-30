import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class InputOutputFileSystem_18 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/j3n5en/Downloads/demo.txt"));
        String longestWord = "";
        while (scanner.hasNext()) {
            String currentWord = scanner.next();
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }
        System.out.println("longest word: " + longestWord);
    }
}
