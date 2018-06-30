import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class InputOutputFileSystem_8 {
    public static void main(String[] args)  throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input your name: ");
        String name = bufferedReader.readLine();
        System.out.println("Your name is: " + name);
    }
}
