import java.io.File;
import java.util.Date;


class InputOutputFileSystem_7 {
    public static void main(String[] args) {
        File file = new File("/Users/j3n5en/Downloads/demo.txt");
        System.out.println("Last modified: " + new Date(file.lastModified()));
    }

}
