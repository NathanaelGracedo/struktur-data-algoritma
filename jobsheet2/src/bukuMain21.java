public class bukuMain21 {
    public static void main(String[] args) {
        // buku21 bk1 = new buku21();
        // bk1.judul = "Today Ends Tomorrow Comes";
        // bk1.pengarang = "Denanda Pratiwi";
        // bk1.halaman = 198;
        // bk1.stok = 13;
        // bk1.harga = 71000;

        // // bk1.tampilInformasi();
        // bk1.terjual(5);
        // bk1.gantiHarga(60000);
        // // bk1.tampilInformasi();

        buku21 bk2 = new buku21("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.tampilInformasi();
        System.out.println("Harga yang terjual : "+ bk2.hitungHargaTotal(5));
        System.out.println("Diskon: "+ bk2.hitungDiskon(5));
        System.out.println("Harga Bayar: "+ bk2.hitungHargaBayar(5));


        // buku21 nathanael = new buku21("About Starr", "Nathanael", 256, 20, 88000);
        // nathanael.terjual(18);
        // nathanael.tampilInformasi();
    }
}
