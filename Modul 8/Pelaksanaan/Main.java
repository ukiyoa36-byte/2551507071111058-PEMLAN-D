package Pelaksanaan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("nama hewan peliharaan anda: ");
        String nama_hewan = in.next();
        Hewan hewan1 = new Hewan(nama_hewan);
        hewan1.tampilkanNama();
        hewan1.makan();
        hewan1.melompat();
        System.out.println("Jumlah kaki " + nama_hewan + " " + hewan1.jumlahKaki());

        in.close();
    }
}
