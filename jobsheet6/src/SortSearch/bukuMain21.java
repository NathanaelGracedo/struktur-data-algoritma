package SortSearch;

import java.util.Scanner;

public class bukuMain21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);

    pencarianBuku21 data = new pencarianBuku21();
    int jmlBuku = 5;

    System.out.println("================================================================");
    System.out.println("Masukkan data Buku : ");
    for (int i = 0; i < jmlBuku; i++) {
      System.out.println("========================");
      System.out.print("Kode Buku \t : ");
      String kodeBuku = s1.nextLine();
      System.out.print("Judul Buku \t : ");
      String judulBuku = s1.nextLine();
      System.out.print("Tahun terbit \t : ");
      int tahunTerbit = s.nextInt();
      System.out.print("Pengarang \t : ");
      String pengarang = s1.nextLine();
      System.out.print("Stock \t : ");
      int stock = s.nextInt();

      Buku21 m = new Buku21(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
      data.tambah(m);
    }

    System.out.println("================================================");
    System.out.println("Data Keseluruhan Buku :");
    data.tampil();

    System.out.println("________________________________________________________________");
    System.out.println("________________________________________________________________");
    System.out.println("Pencarian Data: ");
    System.out.println("Masukkan kode Buku yang dicari: ");
    System.out.print("Kode Buku : ");
    String cari = s1.nextLine();

    System.out.println("Metode Sequential Search");
    int posisiSeq = data.FindSeqSearchStr(cari);
    data.Tampilposisi(cari, posisiSeq);
    data.TampilData(cari, posisiSeq);

    System.out.println("Metode Binary Search");
    int posisiBin = data.FindBinarySearchStr(cari, 0, jmlBuku - 1);
    data.Tampilposisi(cari, posisiBin);
    data.TampilData(cari, posisiBin);

    System.out.println("Pencarian Judul Buku: ");
    System.out.print("Masukkan judul buku yang dicari: ");
    String cariJudul = s1.nextLine();

    System.out.println("Metode Sequential Search");
    data.sortJudul(); 
    int posisiSeqJudul = data.FindSeqSearchJudul(cariJudul);
    data.Tampilposisi(cariJudul, posisiSeqJudul);
    data.TampilDataBuku(cariJudul); 

    System.out.println("Metode Binary Search");
    int posisiBinJudul = data.FindBinarySearchJudul(cariJudul, 0, jmlBuku - 1);
    data.Tampilposisi(cariJudul, posisiBinJudul);
    data.TampilDataBuku(cariJudul); 

    s.close();
    s1.close();
  }
}
