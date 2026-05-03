package Praktikum1;

abstract class Mahasiswa {
    double Tugas, Kuis, UTS, UAS, Hasil;

    public Mahasiswa (double Tugas, double Kuis, double UTS, double UAS) {
        this.Tugas = Tugas;
        this.Kuis = Kuis;
        this.UTS = UTS;
        this.UAS = UAS;
    }

    public abstract double hitungNilaiAkhir();

    class ASD extends Mahasiswa {
        public ASD(double Tugas, double Kuis, double UTS, double UAS) {
            super(Tugas, Kuis, UTS, UAS);
        }
        @Override
        public double hitungNilaiAkhir() {
            Hasil = (0.2 * Tugas) + (0.1 * Kuis) + (0.3 * UTS) + (0.4 * UAS);
            return Hasil;
        }
    }

    class Pemlan extends Mahasiswa {
        public Pemlan(double Tugas, double Kuis, double UTS, double UAS) {
            super(Tugas, Kuis, UTS, UAS);
        }
        @Override
        public double hitungNilaiAkhir() {
            Hasil = (0.3 * Tugas) + (0.1 * Kuis) + (0.2 * UTS) + (0.4 * UAS);
            return Hasil;
        }
    }

    class Matkomlan extends Mahasiswa {
        public Matkomlan(double Tugas, double Kuis, double UTS, double UAS) {
            super(Tugas, Kuis, UTS, UAS);
        }
        @Override
        public double hitungNilaiAkhir() {
            Hasil = (0.1 * Tugas) + (0.2 * Kuis) + (0.3 * UTS) + (0.4 * UAS);
            return Hasil;
        }
    }

    class Probstat extends Mahasiswa {
        public Probstat(double Tugas, double Kuis, double UTS, double UAS) {
            super(Tugas, Kuis, UTS, UAS);
        }
        @Override
        public double hitungNilaiAkhir() {
            Hasil = (0.2 * Tugas) + (0.2 * Kuis) + (0.2 * UTS) + (0.4 * UAS);
            return Hasil;
        }
    }
}
