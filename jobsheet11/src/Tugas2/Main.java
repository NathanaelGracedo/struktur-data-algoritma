package Tugas2;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Tambah antrian");
        System.out.println("2. Hapus antrian");
        System.out.println("3. Lihat antrian terdepan");
        System.out.println("4. Tampilkan semua antrian");
        System.out.println("5. Keluar");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine(); 
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    int nim = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa dequeuedMhs = queue.dequeue();
                    if (dequeuedMhs != null) {
                        System.out.println("Mahasiswa yang dikeluarkan: NIM = " + dequeuedMhs.nim + ", Nama = " + dequeuedMhs.nama);
                    }
                    break;
                case 3:
                    Mahasiswa frontMhs = queue.peek();
                    if (frontMhs != null) {
                        System.out.println("Mahasiswa terdepan: NIM = " + frontMhs.nim + ", Nama = " + frontMhs.nama);
                    }
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 5);

        sc.close();
    }
}
