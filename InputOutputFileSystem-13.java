import java.io.*;


class InputOutputFileSystem_13 {
    public static void main(String[] args) {
        File file = new File("/Users/j3n5en/Downloads/demo.txt");
        BufferedReader bufferedReader = null;
        StringBuilder content = new StringBuilder();
        String lines;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                content.append(lines);

            }
            System.out.println(content);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                System.err.println("Unable to close the file.");
            }
        }
    }
}
