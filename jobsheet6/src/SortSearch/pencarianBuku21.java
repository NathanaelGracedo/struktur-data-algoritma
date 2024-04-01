package SortSearch;


public class pencarianBuku21 {
  Buku21 listBk[] = new Buku21[5];
  int idx;

  void tambah(Buku21 m) {
    if (idx < listBk.length) {
      listBk[idx] = m;
      idx++;
    } else {
      System.out.println("Data sudah penuh");
    }
  }

  void tampil() {
    for (Buku21 m : listBk) {
      m.tampilDataBuku();
    }
  }

  public int FindSeqSearchStr(String cari) {
    int posisi = -1;
    for (int j = 0; j < listBk.length; j++) {
      if (listBk[j].kodeBuku.equals(cari)) {
        posisi = j;
        break;
      }
    }
    return posisi;
  }

  public void Tampilposisi(String x, int pos) {
    if (pos != -1) {
      System.out.println("data : " + x + " ditemukan pada indeks " + pos);
    } else {
      System.out.println("data : " + x + " tidak ditemukan");
    }
  }

  public void TampilData(String x, int pos) {
    if (pos != -1) {
      System.out.println("Kode Buku \t : " + x);
      System.out.println("Judul Buku \t : " + listBk[pos].judulBuku);
      System.out.println("Tahun terbit \t : " + listBk[pos].tahunTerbit);
      System.out.println("Pengarang \t : " + listBk[pos].pengarang);
      System.out.println("Stock \t : " + listBk[pos].stock);
    } else {
      System.out.println("data " + x + " tidak ditemukan");
    }
  }

  public Buku21 findBuku(String cari) {
    Buku21 bukuFound = null;

    for (int i = 0; i < listBk.length; i++) {
      if (listBk[i].kodeBuku.equals(cari)) {
        bukuFound = listBk[i];
        break;
      }
    }
    return bukuFound;
  }

  public int FindBinarySearchStr(String cari, int left, int right) {
    while (right >= left) {
      int mid = (right + left) / 2;
      if (cari.equals(listBk[mid].kodeBuku)) {
        return mid;
      }
      if (listBk[left].kodeBuku.compareTo(cari) <= 0 && cari.compareTo(listBk[mid].kodeBuku) <= 0) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }

  // Pencarian Judul Buku

  public int FindSeqSearchJudul(String cari) {
    int posisi = -1;
    for (int j = 0; j < listBk.length; j++) {
      if (listBk[j].judulBuku.toLowerCase().contains(cari.toLowerCase())) {
        posisi = j;
        break;
      }
    }
    return posisi;
  }

  public int FindBinarySearchJudul(String cari, int left, int right) {
    while (right >= left) {
      int mid = (right + left) / 2;
      if (cari.toLowerCase().compareTo(listBk[mid].judulBuku.toLowerCase()) == 0) {
        return mid;
      }
      if (listBk[left].judulBuku.toLowerCase().compareTo(cari.toLowerCase()) <= 0 && cari.toLowerCase().compareTo(listBk[mid].judulBuku.toLowerCase()) <= 0) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
  
  public void sortJudul() {
    for (int i = 0; i < listBk.length - 1; i++) {
      for (int j = 0; j < listBk.length - i - 1; j++) {
        if (listBk[j].judulBuku.toLowerCase().compareTo(listBk[j + 1].judulBuku.toLowerCase()) > 0) {
          Buku21 temp = listBk[j];
          listBk[j] = listBk[j + 1];
          listBk[j + 1] = temp;
        }
      }
    }
  }
  
  public void TampilDataBuku(String judul) {
    int totalDitemukan = 0;
    for (int i = 0; i < listBk.length; i++) {
      if (listBk[i].judulBuku.toLowerCase().contains(judul.toLowerCase())) {
        totalDitemukan++;
        System.out.println("Data ke-" + totalDitemukan + ":");
        System.out.println("================================");
        System.out.println("Kode buku :" + listBk[i].kodeBuku);
        System.out.println("Judul buku :" + listBk[i].judulBuku);
        System.out.println("Tahun terbit :" + listBk[i].tahunTerbit);
        System.out.println("Pengarang :" + listBk[i].pengarang);
        System.out.println("Stock :" + listBk[i].stock);
      }
    }
    if (totalDitemukan > 1) {
      System.out.println("Peringatan: Ditemukan " + totalDitemukan + " judul buku yang mengandung kata \"" + judul + "\".");
    } else if (totalDitemukan == 0) {
      System.out.println("Data tidak ditemukan");
    }
  }
  
}
  