package Pelaksanaan;
public class Manusia implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
        
    }
    
    @Override
    public void tampilkanNama() {
    System.out.println("Nama saya: " + this.nama);}
    
    @Override
    public void tampilkanUmur() {
    System.out.println("Umur saya: " + this.umur);}

    @Override
    public void melompat() {
        System.out.println(nama + " bisa melompat");
    }

    @Override
    public void makan() {
        System.out.println(nama +" makan pakai sendok atau tangan");
    }
    @Override
    public int jumlahKaki() {
        return 2;
    }
}