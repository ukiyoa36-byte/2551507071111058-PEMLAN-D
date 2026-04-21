package Praktikum;

public class Main {
    public static void main(String[] args) {
        Employee Karyawan1 = new Employee(101, "Qalby",5000000);
        Employee Karyawan2 = new Employee(102, "Daffa",4500000);

        // Membuat beberapa invoice untuk Karyawan 1
        Karyawan1.addInvoice(new Invoice("Buku", 10, 5000));
        Karyawan1.addInvoice(new Invoice("Pulpen", 5, 2000));
        Karyawan1.addInvoice(new Invoice("Tas", 2, 100000));

        // Membuat beberapa invoice untuk Karyawan 2
        Karyawan2.addInvoice(new Invoice("Sepatu", 1, 300000));
        Karyawan2.addInvoice(new Invoice("Kaos", 3, 75000));
        Karyawan2.addInvoice(new Invoice("Celana", 2, 150000));

        // Menampilkan informasi karyawan dan invoice
        System.out.println(Karyawan1);
        System.out.println(Karyawan2);
        
        System.out.println("\n=== LAPORAN PENGGAJIAN BULANAN ===\n");
        Payable[] payables = {Karyawan1, Karyawan2};
        int totalPayment = 0;

        for (Payable payable : payables) {
            if (payable instanceof Employee) {
                Employee emp = (Employee) payable;
                int amount = payable.getPayableAmount();
                System.out.printf("%s: Rp%,d\n", emp.getName(), amount);
                totalPayment += amount;
            }
        }

        System.out.println("\nTotal Pembayaran Gaji Bersih: Rp" + String.format("%,d", totalPayment));
    }
}
