import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class InputOutputFileSystem_14 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/j3n5en/Downloads/demo.txt"));
        String sLine;
        List<String> lines = new ArrayList<>();

        while ((sLine = bufferedReader.readLine()) != null) {
            lines.add(sLine);
        }
        bufferedReader.close();
        System.out.println(Arrays.toString(lines.toArray()));
    }
}
