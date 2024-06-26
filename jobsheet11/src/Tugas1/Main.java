package Tugas1;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Tambah Mahasiswa di awal");
        System.out.println("2. Tambah Mahasiswa di akhir");
        System.out.println("3. Tambah Mahasiswa setelah NIM tertentu");
        System.out.println("4. Tambah Mahasiswa pada indeks tertentu");
        System.out.println("5. Tampilkan semua Mahasiswa");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList list = new SingleLinkedList();

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    int nimAwal = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama: ");
                    String namaAwal = sc.nextLine();
                    Mahasiswa mhsAwal = new Mahasiswa(nimAwal, namaAwal);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    System.out.print("NIM: ");
                    int nimAkhir = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama: ");
                    String namaAkhir = sc.nextLine();
                    Mahasiswa mhsAkhir = new Mahasiswa(nimAkhir, namaAkhir);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM setelah mahasiswa dengan NIM tersebut akan ditambahkan: ");
                    int nimKey = sc.nextInt();
                    sc.nextLine();
                    System.out.print("NIM: ");
                    int nimInsert = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama: ");
                    String namaInsert = sc.nextLine();
                    Mahasiswa mhsInsert = new Mahasiswa(nimInsert, namaInsert);
                    list.insertAfter(nimKey, mhsInsert);
                    break;
                case 4:
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("NIM: ");
                    int nimIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama: ");
                    String namaIndex = sc.nextLine();
                    Mahasiswa mhsIndex = new Mahasiswa(nimIndex, namaIndex);
                    list.insertAt(index, mhsIndex);
                    break;
                case 5:
                    list.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 5);
        sc.close();
    }
}
