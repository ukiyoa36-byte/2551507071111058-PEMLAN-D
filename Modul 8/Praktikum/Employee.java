package Praktikum;

public class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer SalaryPerMonth;
    private Invoice[] invoice;
    private Integer invoiceCount;

    public Employee(Integer registrationNumber, String name, Integer SalaryPerMonth){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.SalaryPerMonth = SalaryPerMonth;
        this.invoice = new Invoice[100];
        this.invoiceCount = 0;
    }
    
    public void addInvoice(Invoice invoice){
        if (invoiceCount < this.invoice.length) {
            this.invoice[invoiceCount] = invoice;
            invoiceCount++;
        } else {
            System.out.println("Pembatasan invoice telah tercapai. Tidak dapat menambahkan invoice baru.");
        }
    }

     private int getTotalInvoiceAmount() {
        int total = 0;
        for (int i = 0; i < invoiceCount; i++) {
            total += invoice[i].getPayableAmount();
        }
        return total;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public String getName() {
        return name;
    }
    public int getSalaryPerMonth() {
        return SalaryPerMonth;
    }
    public Invoice[] getInvoice() {
        return invoice;
    }
    public int getInvoiceCount() {
        return invoiceCount;
    }
    public int getTotalDebt() {
        return getTotalInvoiceAmount();
    }
    @Override
    public int getPayableAmount() {
        return SalaryPerMonth - getTotalInvoiceAmount();
    }

    
    @Override
    public String toString() {
        String result = "\n=== INFORMASI KARYAWAN ===\n";
        result += "Nomor Registrasi: " + registrationNumber + "\n";
        result += "Nama: " + name + "\n";
        result += "Gaji Per Bulan: Rp" + String.format("%,d", SalaryPerMonth) + "\n\n";
        result += "Detail Belanja di Koperasi:\n";

        if (invoiceCount > 0) {
            for (int i = 0; i < invoiceCount; i++) {
                result += invoice[i].toString() + "\n";
            }
            result += "\nTotal Hutang: Rp" + String.format("%,d", getTotalInvoiceAmount()) + "\n";
        } else {
            result += "(Tidak ada belanja di bulan ini)\n";
        }

        result += "\nGaji Bersih (setelah pemotongan hutang): Rp" + String.format("%,d", getPayableAmount()) + "\n";

        return result;
    }


    


}
