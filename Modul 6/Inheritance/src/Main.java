import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Manusia a = new Manusia("Habibie", true, "1304130203070001", true);
        System.out.println(a);
        System.out.println("==============");

        Manusia b = new Manusia("Perempuan", false, "130413020467999", true);
        System.out.println(b);
        System.out.println("==============");

        Manusia c = new Manusia("Laki-laki", true, "130413020467999", false);
        System.out.println(c);
        System.out.println("==============");
        System.out.println();

        // MahsiswaFILKOM
        MahasiswaFILKOM ab = new MahasiswaFILKOM("Habibie", true, "1304130203070001", true, "255150707111058", 2);
        System.out.println(ab);
        System.out.println("==============");
        MahasiswaFILKOM ac = new MahasiswaFILKOM("Perempuan", false, "130413020467999", true, "255150707111059", 3.6);
        System.out.println(ac);
        System.out.println("==============");
        MahasiswaFILKOM ad = new MahasiswaFILKOM("Laki-laki", true, "130413020467999", false, "255150707111060", 3);
        System.out.println(ad);
        System.out.println("==============");
        System.out.println();

        // Pekerja
        Pekerja ba = new Pekerja("Habibie", true, "1304130203070001", true, 500000, java.time.LocalDate.of(2024, 1, 1), 2);
        System.out.println(ba);
        System.out.println("==============");
        Pekerja bb = new Pekerja("Perempuan", false, "130413020467999", true, 50000, java.time.LocalDate.of(2017, 1, 1), 0);
        System.out.println(bb);
        System.out.println("==============");
        Pekerja bc = new Pekerja("Laki-laki", true, "130413020467999", false, 5000000, java.time.LocalDate.of(2006, 1, 1), 10);
        System.out.println(bc);
        System.out.println("==============");
        System.out.println();

        // Manager
        Manager ca = new Manager("Habibie", true, "1304130203070001", true, 7500, java.time.LocalDate.of(2011, 1, 1), 2, "IT");
        System.out.println(ca);
    }
}
