import java.io.*;


class InputOutputFileSystem_12 {
    public static void main(String[] args) {
        File file = new File("/Users/j3n5en/Downloads/demo.txt");
        BufferedReader bufferedReader = null;
        StringBuffer stringBuffer = new StringBuffer();
        String lines;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                stringBuffer.append(lines);
                stringBuffer.append(System.lineSeparator());

            }
            System.out.println(stringBuffer);
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
