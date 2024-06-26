package RentalBarang;

public class transaksiRental {
    static int counter = 1;
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    barangRental barang;
    transaksiRental next;
    transaksiRental prev;

    public transaksiRental(String namaPeminjam, int lamaPinjam, barangRental barang){
        this.kodeTransaksi = counter++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.barang = barang;
        
        //Menghitung total biaya berdasarkan lama pinjamnya peminjam dan biaya sewa barang
        this.totalBiaya = lamaPinjam * barang.biayaSewa;
    }


    public String infoTransaksi() {
        return "Kode Transaksi: " + kodeTransaksi + 
               ", Nama Peminjam: " + namaPeminjam +
               ", Lama Pinjam: " + lamaPinjam + "hari" + 
               ", Total Biaya: " + totalBiaya +
               "\n Barang yang dipinjam: " + barang.infoBarang();
    }
}
