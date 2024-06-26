package RentalBarang;

public class barangRental {
    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;

    public barangRental(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa){
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }

    public String infoBarang() {
        return "No. TNKB: " + noTNKB +
               ", Nama Kendaraan: " + namaKendaraan +
               ", Jenis: " + jenisKendaraan +
               ", Tahun: " + tahun +
               ", Biaya Sewa: " + biayaSewa;
    }
}
