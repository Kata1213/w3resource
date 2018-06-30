import java.io.File;


class InputOutputFileSystem_1 {
    public static void main(String[] args) {
        File file = new File("/");
        for (String name : file.list()) {
            System.out.println(name);
        }
    }
}
