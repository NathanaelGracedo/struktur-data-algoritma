package Bioskop;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu Film:");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data index tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID film");
            System.out.println("9. Urut data rating film - Descending");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul1 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating1 = scanner.nextDouble();
                    dll.addFirst(new Film(id1, judul1, rating1));
                    break;
                case 2:
                    System.out.print("Masukkan ID: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul2 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating2 = scanner.nextDouble();
                    dll.addLast(new Film(id2, judul2, rating2));
                    break;
                case 3:
                    System.out.print("Masukkan ID: ");
                    int id3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul3 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating3 = scanner.nextDouble();
                    System.out.print("Masukkan indeks: ");
                    int index = scanner.nextInt();
                    try {
                        dll.add(new Film(id3, judul3, rating3), index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        dll.removeFirst();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        dll.removeLast();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Masukkan indeks: ");
                    int indexRemove = scanner.nextInt();
                    try {
                        dll.remove(indexRemove);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Daftar Film:");
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film: ");
                    int searchID = scanner.nextInt();
                    dll.searchByID(searchID);
                    break;
                case 9:
                    dll.sortDescending();
                    System.out.println("Data berhasil diurutkan berdasarkan rating (Descending)");
                    break;
                case 10:
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
