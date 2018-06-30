import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


class InputOutputFileSystem_15 {
    public static void main(String[] args) {
        String filename = "/Users/j3n5en/Downloads/demo.txt";
        try {
            FileWriter fileWriter = new FileWriter(filename, false);

            fileWriter.write("InputOutputFileSystem_15");
            fileWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String sLine;
            while ((sLine = bufferedReader.readLine()) != null) {
                System.out.println(sLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
