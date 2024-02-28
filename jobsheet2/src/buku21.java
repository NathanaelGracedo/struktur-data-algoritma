public class buku21 {
    String judul, pengarang;
    int halaman, stok, harga;
    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: "+ halaman);
        System.out.println("Sisa stok: "+ stok);
        System.out.println("Harga: Rp "+ harga);
        
    }

    void terjual(int jml){
        if (stok > 0) {
            stok -= jml; 
        } else {
            System.out.println("Jumlah stok habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    public buku21() {

    }

    int hitungHargaTotal(int jml){
        return harga*jml;
    }

    int hitungDiskon(int jml){
        int diskon = 0;
        int hargaTotal = hitungHargaTotal(jml);
        if (hargaTotal>150000) {
            diskon = (int)(0.12*hargaTotal);
        } else if( hargaTotal<150000 && hargaTotal>=75000){
            diskon = (int)(0.05*hargaTotal);
        }else
            diskon = 0;
        return diskon;
    }

    int hitungHargaBayar(int jml){
        return hitungHargaTotal(jml)-hitungDiskon(jml);
    }

    public buku21(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
        
    }
}

