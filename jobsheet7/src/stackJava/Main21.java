package stackJava;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitasGudang = scanner.nextInt();
        scanner.nextLine();

        Gudang21 gudang = new Gudang21(kapasitasGudang);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Lihat barang teratas");
            System.out.println("4. Tampilkan tumpukan barang");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");

            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang21 barangBaru = new Barang21(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.lihatBarangTeratas();
                    break;
                case 4:
                    gudang.tampilkanBarang();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode barang yang ingin dicari: ");
                    int kodeCari = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    gudang.cariBarang(kodeCari, namaCari);
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
            }
        }
    }
}
