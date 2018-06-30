import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class InputOutputFileSystem_10 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        byte[] text = new byte[2 * 1024];
        try {
            File file = new File("/Users/j3n5en/Downloads/demo.txt");
            inputStream = new FileInputStream(file);
            int readCount = 0;
            while ((readCount = inputStream.read(text)) > 0) {
                System.out.println(new String(text, 0, readCount - 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
