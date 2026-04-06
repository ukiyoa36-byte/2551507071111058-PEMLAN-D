public class Manusia{
    private String nama;
    private boolean jenisKelamin;
    private String NIK;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String NIK, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.NIK = NIK;
        this.menikah = menikah;
    }


    public void setNama(String a){
       this.nama = a;
    }
    public void setJenisKelamin (boolean a){
        this.jenisKelamin = a;
    }
    public void setNIK (String a){
        this.NIK = a;
    }
    public void setMenikah (boolean a){
        this.menikah = a;
    }
    
    public String getNama(){
        return this.nama;
    }
    public boolean getJenisKelamin(){
        return this.jenisKelamin;
    }
    public String getNIK(){
        return this.NIK;
    }
    public boolean getMenikah(){
        return this.menikah;
    }

    public double getTunjangan(){
        if (this.jenisKelamin == true && this.menikah == true){
            return 25;
        } else if (this.jenisKelamin == true && this.menikah == false){
            return 15;
        } else if (this.jenisKelamin == false && this.menikah == true){
            return 20;
        } else {
            return 15;
        }
            
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    @Override
    public String toString(){
        return "Nama: " + this.nama 
        + "\nJenis Kelamin: " + (this.jenisKelamin ? "Laki-laki" : "Perempuan") 
        + "\nNIK: " + this.NIK 
        + "\nMenikah: " + (this.menikah ? "Ya" : "Tidak") 
        + "\nTunjangan: " + getTunjangan() 
        + "\nPendapatan: " + getPendapatan();
    }
}



