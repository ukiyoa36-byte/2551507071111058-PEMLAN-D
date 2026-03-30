package jaket;
import java.util.Scanner;
public class Jaket {

    // harga normal (final + static)
    public static final int JAKET_A = 100000;
    public static final int JAKET_B = 125000;
    public static final int JAKET_C = 175000;

    // harga diskon
    public static final int DISKON_A = 95000;
    public static final int DISKON_B = 120000;
    public static final int DISKON_C = 160000;

    // method hitung total
    public static int hitungTotal(int jumlahA, int jumlahB, int jumlahC) {
       if (jumlahA > 100) {
            jumlahA = DISKON_A * jumlahA;
        } else {
            jumlahA = JAKET_A * jumlahA;
        }

        if (jumlahB > 100) {
            jumlahB = DISKON_B * jumlahB;
        } else {
            jumlahB = JAKET_B * jumlahB;
        }

        if (jumlahC > 100) {
            jumlahC = DISKON_C * jumlahC;
        } else {
            jumlahC = JAKET_C * jumlahC;
        }

        return jumlahA + jumlahB + jumlahC;
    }

    public static void getHarga() {
        System.out.println("Harga Jaket A: Rp " + JAKET_A);
        System.out.println("Harga Jaket B: Rp " + JAKET_B);
        System.out.println("Harga Jaket C: Rp " + JAKET_C);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di toko jaket kami!");
        System.out.println("================================");
        System.out.println("masukkan jumlah jaket A: ");
        int jumlahA = in.nextInt();
        System.out.println("masukkan jumlah jaket B: ");
        int jumlahB = in.nextInt();
        System.out.println("masukkan jumlah jaket C: ");
        int jumlahC = in.nextInt();

        getHarga();
        int total = hitungTotal(jumlahA, jumlahB, jumlahC);  
        System.out.println("Total harga: Rp " + total);
        in.close();
    }
    
}
