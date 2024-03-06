public class Pegawai {
    String nama;
    int masaKerjaThn;
    double jamLembur;
    int gajiPokok;
    
    public Pegawai(String nama, int masaKerjaThn, double jamLembur, int gajiPokok) {
    this.nama = nama;
    this.masaKerjaThn = masaKerjaThn;
    this.jamLembur = jamLembur;
    this.gajiPokok = gajiPokok;
    }

    public double hitungGajiLembur(){
        double hitungGajiLembur = 0;
        hitungGajiLembur = masaKerjaThn >= 5 ? 0.1 * gajiPokok : 0.5 * gajiPokok;
        return hitungGajiLembur * jamLembur;
    }
    
    public double hitungTunjangan(){
        return masaKerjaThn >= 5 ? 0.5 * gajiPokok : 0.25 * gajiPokok;
    }

    double hitungGajiTotal(){
        return gajiPokok + hitungGajiLembur() + hitungTunjangan();
    }

    void printData(){
        System.out.println("Nama: " + nama);
        System.out.println("Masa Kerja (Tahun): " + masaKerjaThn);
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Gaji Lembur: " + hitungGajiLembur());
        System.out.println("Tunjangan: " + hitungTunjangan());
        System.out.println("Gaji total: " + hitungGajiTotal());
        System.out.println();
    }
}
