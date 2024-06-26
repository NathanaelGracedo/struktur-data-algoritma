package Vaksin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu Antrian Vaksinasi:");
            System.out.println("1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data penerima vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan No. Antrian: ");
                    int no = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    dll.addLast(new Orang(no, nama));
                    break;
                case 2:
                    dll.removeFirst();
                    break;
                case 3:
                    System.out.println("Daftar Penerima Vaksin:");
                    dll.print();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
