import java.io.File;


class InputOutputFileSystem_5 {
    public static void main(String[] args) {
        File file = new File("/Users/j3n5en/Downloads/demo.txt");
        System.out.print(file.getAbsolutePath());
        System.out.println((file.isDirectory() ? " " : " not ") + "a directory");
        System.out.print(file.getAbsolutePath());
        System.out.println((file.isFile() ? " " : " not ") + "a file");
    }
}
