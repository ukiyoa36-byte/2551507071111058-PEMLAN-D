package Pelaksanaan;
public class Hewan implements MakhlukHidup {
    public String nama_hewan;
    public Hewan (String nama_hewan){
        this.nama_hewan = nama_hewan;

    }
    @Override
    public void makan() {
        System.out.println(nama_hewan+ " makan pakai mulut");
    }
    @Override
    public void melompat() {
        System.out.println( nama_hewan +" melompat menggunakan kaki");
    }
    @Override
    public int jumlahKaki() {
        return 4;
    }
    public void tampilkanNama (){}
    public void tampilkanUmur () {}
}
