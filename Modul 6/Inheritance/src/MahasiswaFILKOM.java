public class MahasiswaFILKOM extends Manusia {
    private String NIM;
    private double IPK;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin,String NIK,boolean menikah,String NIM, double IPK){
        super(nama, jenisKelamin, NIK, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public void setNIM(String a){
        this.NIM = a;
    }

    public void setIPK(double a){
        this.IPK = a;
    }

    public String getNIM(){
        return this.NIM;
    }

    public double getIPK(){
        return this.IPK;
    }
    
    public String getStatus(){
        String angkatan = this.NIM.substring(0, 2);
        char jurusan = this.NIM.charAt(6);
        String i = "";
        if (jurusan == '2'){
            i = "Teknik Informatika, " + angkatan;
        } else if (jurusan == '3'){
            i =  "Teknik Komputer, " + angkatan;
        } else if  (jurusan == '4'){
            i = "Sistem Informai, " + angkatan;
        } else if  (jurusan == '6'){
            i =  "Pendidikan Teknologi Informasi, " + angkatan;
        } else if  (jurusan == '7'){
            i =  "Teknologi Informasi, " + angkatan;
        }
        return i;
    }

    public double getBeasiswa(){
        double beasiswa = 0;
        if (this.IPK >= 3.0 && this.IPK <= 3.5){
            return beasiswa += 50;
        } else if ( this.IPK > 3.5 && this.IPK <= 4.0){
            return beasiswa += 75;
        } else {
            return beasiswa;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nNIM: " + this.NIM + "\nIPK: " + this.IPK + "\nStatus: " + getStatus() + "\nBeasiswa: " + getBeasiswa(); 
    }
    


}
