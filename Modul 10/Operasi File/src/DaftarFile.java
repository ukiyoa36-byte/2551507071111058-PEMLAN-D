import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        File direktori = new File("D:\\Pemograman\\Pemlan Praktikum\\VSCODE\\Modul 10\\Operasi File");
        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles();
            System.out.println("Daftar file dalam direktori:");
            for (File file : daftarFile) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
