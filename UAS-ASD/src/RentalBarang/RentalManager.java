package RentalBarang;

import java.util.Scanner;

public class RentalManager {
    transaksiRental head;
    transaksiRental tail;

    // Method untuk menambah transaksi baru
    public void tambahTransaksi(String namaPeminjam, int lamaPinjam, barangRental barang) {
        transaksiRental newTransaction = new transaksiRental(namaPeminjam, lamaPinjam, barang);

        if (head == null) {
            // Jika linked list masih kosong
            head = newTransaction;
            tail = newTransaction;
        } else {
            // Jika linked list tidak kosong, ditambahkan ke akhir
            newTransaction.prev = tail;
            tail.next = newTransaction;
            tail = newTransaction;
        }
    }

    // Method untuk menampilkan semua barang yang tersedia
    public void tampilkanDaftarBarang() {
        System.out.println("Daftar Barang Rental:");
        // Data barang diinisialisasi di sini karena double linked list tidak digunakan untuk barang
        barangRental barang1 = new barangRental("AG1234", "Toyota Supra", "Mobil", 2024, 200000);
        barangRental barang2 = new barangRental("B5678", "Supra X 125 FI", "Motor", 2021, 50000);
        barangRental barang3 = new barangRental("AE2345", "Vespa Matic", "Motor", 2021, 60000);
        barangRental barang4 = new barangRental("DA9876", "Honda BRV", "Mobil", 2022, 150000);

        System.out.println(barang1.infoBarang());
        System.out.println(barang2.infoBarang());
        System.out.println(barang3.infoBarang());
        System.out.println(barang4.infoBarang());
        System.out.println();
    }

    // Method untuk menampilkan semua transaksi
    public void tampilkanDaftarTransaksi() {
        System.out.println("Daftar Transaksi Rental:");
        transaksiRental current = head;
        while (current != null) {
            System.out.println(current.infoTransaksi());
            System.out.println("---------------------------");
            current = current.next;
        }
        System.out.println();
    }

    //Method untuk mengurutkan transaksi berdasarkan no TNKB (Bubble Sort)
    public void urutkanTransaksi() {
        if (head == null || head == tail) {
            // Jika tidak ada transaksi atau hanya satu transaksi
            return;
        }

        boolean swapped;
        transaksiRental current;
        transaksiRental last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                // Bandingkan nomor TNKB dari dua transaksi berturut-turut
                if (current.barang.noTNKB.compareTo(current.next.barang.noTNKB) > 0) {
                    // Jika nomor TNKB lebih besar, tukar posisi
                    tukarTransaksi(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    // Method untuk menukar posisi dua transaksi
    private void tukarTransaksi(transaksiRental a, transaksiRental b) {
        if (a == b) {
            return;
        }

        // Tukar data transaksi
        transaksiRental tempPrev = a.prev;
        transaksiRental tempNext = a.next;
        
        a.prev = b.prev;
        a.next = b.next;
        b.prev = tempPrev;
        b.next = tempNext;

        if (a.prev != null) {
            a.prev.next = a;
        } else {
            head = a;
        }

        if (a.next != null) {
            a.next.prev = a;
        } else {
            tail = a;
        }

        if (b.prev != null) {
            b.prev.next = b;
        } else {
            head = b;
        }

        if (b.next != null) {
            b.next.prev = b;
        } else {
            tail = b;
        }
    }

    // Method untuk menjalankan menu aplikasi
    public void jalankanMenu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. Tampilkan Daftar Barang");
            System.out.println("2. Tampilkan Daftar Transaksi");
            System.out.println("3. Tambah Transaksi Baru");
            System.out.println("4. Urutkan Transaksi berdasarkan No. TNKB");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarBarang();
                    break;
                case 2:
                    tampilkanDaftarTransaksi();
                    break;
                case 3:
                    tambahTransaksiFromInput(scanner);
                    break;
                case 4:
                    urutkanTransaksi();
                    System.out.println("Transaksi berhasil diurutkan berdasarkan No. TNKB.");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 0);
    }

    // Method untuk menambah transaksi berdasarkan input dari pengguna
    private void tambahTransaksiFromInput(Scanner scanner) {
        System.out.println("===== TAMBAH TRANSAKSI BARU =====");
        tampilkanDaftarBarang();
        scanner.nextLine(); 
        System.out.print("Masukkan nama peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan kode barang yang dipinjam: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Masukkan lama pinjam (Jam): ");
        int lamaPinjam = scanner.nextInt();

        // Cari barang berdasarkan kode TNKB
        barangRental barangDipinjam = cariBarangBerdasarkanKode(kodeBarang);
        if (barangDipinjam != null) {
            tambahTransaksi(namaPeminjam, lamaPinjam, barangDipinjam);
            System.out.println("Transaksi berhasil ditambahkan!");
        } else {
            System.out.println("Barang tidak ditemukan. Transaksi dibatalkan.");
        }
        System.out.println();
    }

    // Method untuk mencari barang berdasarkan kode TNKB
    private barangRental cariBarangBerdasarkanKode(String kodeBarang) {
        if (kodeBarang.equalsIgnoreCase("AG1234")) {
            return new barangRental("AG1234", "Toyota Supra", "Mobil", 2024, 200000);
        } else if (kodeBarang.equalsIgnoreCase("M5678")) {
            return new barangRental("B5678", "Supra X 125 FI", "Motor", 2021, 50000);
        } else if (kodeBarang.equalsIgnoreCase("AE2345")){
            return new barangRental("AE2345", "Vespa Matic", "Motor", 2021, 60000);
        } else if(kodeBarang.equalsIgnoreCase("DA9876")){
            return new barangRental("DA9876", "Honda BRV", "Mobil", 2022, 150000);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        RentalManager manager = new RentalManager();
        manager.jalankanMenu();
    }
}
