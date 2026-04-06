import java.time.LocalDate;
public class Manager extends Pekerja {
    private String departemen ;

    public Manager(String nama, boolean jenisKelamin,String NIK,boolean menikah,double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen){
        super(nama, jenisKelamin, NIK, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }
    public void setDepartemen(String a){
        this.departemen = a;
    }
    public String getDepartemen(){
        return this.departemen;
    }

    @Override
    public double getTunjangan(){
        double a = super.getGaji() * 0.1;
        double tunjangan = super.getTunjangan() + a;
        return tunjangan;
    }
    public String toString() {
        return super.toString() + "\nDepartemen: " + this.departemen + "\nTunjangan: " + getTunjangan();
    }
}
