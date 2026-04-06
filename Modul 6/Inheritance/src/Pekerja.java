import java.time.LocalDate;
public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin,String NIK,boolean menikah,double gaji, LocalDate tahunMasuk, int jumlahAnak){
        super(nama, jenisKelamin, NIK, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double a){
        this.gaji = a;
    }

    public void setTahunMasuk(LocalDate a){
        this.tahunMasuk = a;
    }

    public void setJumlahAnak(int a){
        this.jumlahAnak = a;
    }

    public double getGaji(){
        return this.gaji;
    }

    public LocalDate getTahunMasuk(){
        return this.tahunMasuk;
    }

    public int getJumlahAnak(){
        return this.jumlahAnak;
    }

    public double getBonus(){
        double bonus = 0;
        int lamaKerja = LocalDate.now().getYear() - this.tahunMasuk.getYear();
        if(lamaKerja >= 0 && lamaKerja <= 5 ){
            bonus = 0.05 * this.gaji;
        } else if (lamaKerja > 5 && lamaKerja <= 10){
            bonus = 0.1 * this.gaji;
        } else if (lamaKerja > 10 ){
            bonus = 0.15 * this.gaji;
        } else {
            bonus = 0;
        }
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGaji: " + this.gaji + "\nTahun Masuk: " + this.tahunMasuk + "\nJumlah Anak: " + this.jumlahAnak + "\nBonus: " + getBonus();
    }
}
