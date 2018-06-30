import java.io.File;

class InputOutputFileSystem_3 {
    public static void main(String[] args) {
        File hostsFile = new File("/etc/hosts");
        if (hostsFile.exists()) {
            System.out.println("The directory or file exists.");
        }
        else {
            System.out.println("The directory or file does not exist.");
        }
    }
}
