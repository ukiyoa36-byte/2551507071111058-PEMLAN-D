import java.io.File;
public class UkuranFile {

    public static void main(String[] args) {

        File file = new File("test.txt");

        if (file.exists()) {

            long byteFile = file.length();

            double kb = byteFile / 1024.0;
            double mb = kb / 1024.0;

            if (mb < 1) {
                System.out.printf("Ukuran file: %.2f KB%n", kb);
            } else {
                System.out.printf("Ukuran file: %.2f MB%n", mb);
            }

        } else {
            System.out.println("File tidak ditemukan.");
        }
    }
}