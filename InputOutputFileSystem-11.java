import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


class InputOutputFileSystem_11 {
    public static void main(String[] args) {
        BufferedReader br;
        String strLine;
        try {
            br = new BufferedReader(new FileReader("/Users/j3n5en/Downloads/demo.txt"));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
