package Perbankan;

import java.util.Scanner;

public class OpsiBank {
     // Inisialisasi array dengan data rekening
    static Rekening21[] listRekening = {
        new Rekening21("16030927 3084", "Wallace", "1-458 264-3263", "ligula.Nullam@tacitisociosqu.edu ", 10000),
        new Rekening21("16100617 0573", "Darius", "264-3263, 843-0547", "nec@lectusjusto.org", 7000),
        new Rekening21("16240401 2243", "Fuller", "571-7062", "convallis@Vestibulumanteipsum.org", 5000),
        new Rekening21("16270525 0112", "Malcolm", "623-0234", "porttitor.tellus.non@Curabitur.ca", 44000),
        new Rekening21("16971204 2416", "Geoffrey", "1-683-", "ut.pellentesque@luctusutpellentesque.com", 50000),
        new Rekening21("16100727 8862", "Rudyard", "416-8323, 650-5379", "Proin.eget@velitegestaslacinia.ca", 123000),
        new Rekening21("16460329 4259", "Troy", "897-7608", "pede.Suspendisse.dui@a.ca ", 100000),
        new Rekening21("16320421 3437", "Alec", "792-4447", "non@mus.com", 34000),
        new Rekening21("16180729 7229", "Walter", "863-8209", "Pellentesque.ut.ipsum@neque.ca", 334544),
        new Rekening21("16950313 6823", "Simon", "592-6919", "tellus.justo.sit@commodoauctor.net", 23444),
        new Rekening21("16850708 3528", "Kamal", "1-115-, 339-7678", "dictum@nec.edu", 567770)
    };

    static int jumlahRekening = listRekening.length; // Inisialisasi jumlah rekening dengan panjang array

    // Method untuk menambah data rekening baru
    public static void tambahDataRekening(Scanner sc) {
        if (jumlahRekening >= listRekening.length) { // Periksa apakah jumlah rekening melebihi kapasitas array
            Rekening21[] newListRekening = new Rekening21[listRekening.length * 2]; // Buat array baru dengan kapasitas dua kali lipat
            for (int i = 0; i < listRekening.length; i++) {
                newListRekening[i] = listRekening[i]; // Salin data rekening lama ke array baru
            }
            listRekening = newListRekening; // Gunakan array baru sebagai array rekening
        }
        System.out.print("Nomor Rekening: ");
        String nomorRekening = sc.next();
        System.out.print("Nama: ");
        String nama = sc.next();
        System.out.print("Telepon: ");
        String telefon = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        
        Rekening21 rekening = new Rekening21(nomorRekening, nama, telefon, email, saldo);
        listRekening[jumlahRekening++] = rekening; // Tambahkan data rekening baru ke array
    }
    
    // Method untuk menampilkan semua data rekening
    public static void tampilSemuaRekening() {
        System.out.println("Data Rekening: ");
        for (int i = 0; i < jumlahRekening; i++) {
            Rekening21 rekening = listRekening[i];
            System.out.println("Nomor Rekening: " + rekening.nomorRekening);
            System.out.println("Nama: " + rekening.nama);
            System.out.println("Telefon: " + rekening.telefon);
            System.out.println("Email: " + rekening.email);
            System.out.println("Saldo: " + rekening.saldo);
            System.out.println();
        }
    }

    // Method untuk mengurutkan data rekening menurun berdasarkan saldo
    public static void urutDataRekeningMenurun(){
        for (int i = 0; i < jumlahRekening - 1; i++) {
            for (int j = 0; j < jumlahRekening - i - 1; j++) {
                if (listRekening[j].saldo < listRekening[j + 1].saldo) {
                    Rekening21 temp = listRekening[j];
                    listRekening[j] = listRekening[j + 1];
                    listRekening[j + 1] = temp;
                }
            }
        }
        tampilSemuaRekening(); // Tampilkan data rekening setelah diurutkan
    }

    // Method untuk menampilkan data rekening dengan saldo kurang dari 50000
    public static void tampilSaldoKurangDari(){
        System.out.println("Data Rekening dengan saldo < 50000:");
        for (int i = 0; i < jumlahRekening; i++) {
            if (listRekening[i].saldo < 50000) {
                System.out.println("Nomor Rekening: " + listRekening[i].nomorRekening);
                System.out.println("Nama: " + listRekening[i].nama);
                System.out.println("Saldo: " + listRekening[i].saldo);
                System.out.println();
            }
        }
    }

    // Method untuk mencari data rekening berdasarkan nama pemiliknya
    public static void searchRekening(Scanner sc){
        System.out.print("Masukkan nama pemilik rekening: ");
        String cari = sc.next().toLowerCase();
        System.out.println("Hasil Pencarian:");
        for (int i = 0; i < jumlahRekening; i++) {
            if (listRekening[i].nama.toLowerCase().contains(cari)) {
                System.out.println("Nomor Rekening: " + listRekening[i].nomorRekening);
                System.out.println("Nama: " + listRekening[i].nama);
                System.out.println("Saldo: " + listRekening[i].saldo);
                System.out.println();
            }
        }
    }

    // Method untuk menarik saldo dari rekening
    public static void tarikSaldoRekening(Scanner sc){
        System.out.print("Nomor Rekening: ");
        String nomorRekening = sc.next();
        System.out.print("Jumlah yang akan ditarik: ");
        double jumlah = sc.nextDouble();

        for (int i = 0; i < jumlahRekening; i++) {
            if (listRekening[i].nomorRekening.equals(nomorRekening)) {
                if (listRekening[i].saldo >= jumlah) {
                    listRekening[i].saldo -= jumlah;
                    System.out.println("Penarikan berhasil dilakukan. Sisa saldo anda: " + listRekening[i].saldo);
                } else {
                    System.out.println("Saldo anda tidak mencukupi!!");
                }
                return;
            }
        }
        System.out.println("Nomor Rekening tidak ditemukan");
    }

    // Method untuk melakukan setoran ke rekening
    public static void setorRekening(Scanner sc){
        System.out.print("Nomor Rekening: ");
        String nomorRekening = sc.next();
        System.out.print("Jumlah setor: ");
        double jumlah = sc.nextDouble();

        for (int i = 0; i < jumlahRekening; i++) {
            if (listRekening[i].nomorRekening.equals(nomorRekening)) {
                listRekening[i].saldo += jumlah;
                System.out.println("Setor berhasil dilakukan. Jumlah saldo anda: " + listRekening[i].saldo);
                return;
            }
        }
        System.out.println("Nomor Rekening tidak ditemukan");
    }
}
