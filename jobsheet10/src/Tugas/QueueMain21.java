package Tugas;

import java.util.Scanner;

public class QueueMain21 {

    public static void menu() {
        System.out.println("Masukkan operasi yg diinnginkan");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Ambil Antrian");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Clear");
        System.out.println("===================================");
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Kapasitas Queue: ");
        int n = sc.nextInt();

        Queue21 q = new Queue21(n);
        int pilih;

        do{
            menu();
            pilih = sc.nextInt();
            
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("No. Hp: ");
                    int noHp = sc.nextInt();

                    q.enqueue(new Pembeli21(nama, noHp));
                    break;
                case 2:
                    Pembeli21 dataKeluar = q.dequeue();
                    System.out.println("Data yg dikeluarkan: " + dataKeluar.nama);
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.daftarPembeli();
                    break;
                case 5:
                    q.clear();
                    break;
                default:
                    break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        sc.close();
    }
}
