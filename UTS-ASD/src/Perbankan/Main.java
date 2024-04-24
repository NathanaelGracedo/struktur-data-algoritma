package Perbankan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Tampilkan semua data rekening");
            System.out.println("3. Urutkan data Rekening (berdasarkan saldo) secara menurun");
            System.out.println("4. Tampilkan data rekening yang memiliki saldo < 50000");
            System.out.println("5. Cari data Rekening berdasarkan nama pemiliknya");
            System.out.println("6. Tarik saldo Rekening");
            System.out.println("7. Setor ke Rekening");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    OpsiBank.tambahDataRekening(sc); // Memanggil method untuk menambahkan data rekening baru
                    break;
                case 2:
                    OpsiBank.tampilSemuaRekening(); // Memanggil method untuk menampilkan semua data rekening
                    break;
                case 3:
                    OpsiBank.urutDataRekeningMenurun(); // Memanggil method untuk mengurutkan data rekening secara menurun berdasarkan saldo
                    break;
                case 4:
                    OpsiBank.tampilSaldoKurangDari(); // Memanggil method untuk menampilkan data rekening dengan saldo kurang dari 50000
                    break;
                case 5:
                    OpsiBank.searchRekening(sc); // Memanggil method untuk mencari data rekening berdasarkan nama pemiliknya
                    break;
                case 6:
                    OpsiBank.tarikSaldoRekening(sc); // Memanggil method untuk menarik saldo dari rekening
                    break;
                case 7:
                    OpsiBank.setorRekening(sc); // Memanggil method untuk melakukan setoran ke rekening
                    break;
                case 8:
                    System.out.println("Anda keluar."); // Menampilkan pesan keluar dari program
                    break;
                default:
                    System.out.println("Pilihan tidak valid"); // Menampilkan pesan jika pilihan tidak valid
                    break;
            }
        } while (choice != 8); // Melakukan pengulangan selama pilihan tidak sama dengan 8
    }
}