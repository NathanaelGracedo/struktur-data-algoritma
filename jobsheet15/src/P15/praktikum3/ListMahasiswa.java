package P15.praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    void hapus(int index) {
        mahasiswas.remove(index);
    }

    void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }
    
    void sortByNim(boolean ascending) {
        if (ascending) {
            Collections.sort(mahasiswas, Comparator.comparing(Mahasiswa::getNim));
        } else {
            Collections.sort(mahasiswas, Comparator.comparing(Mahasiswa::getNim).reversed());
        }
    }

    int binarySearch(String nim) {
        sortByNim(true);
        Mahasiswa key = new Mahasiswa(nim, "", ""); // Buat objek Mahasiswa dengan NIM sebagai kunci pencarian
        return Collections.binarySearch(mahasiswas, key, Comparator.comparing(Mahasiswa::getNim));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m1 = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m2 = new Mahasiswa("201235", "Akhleena", "021xx2");
        Mahasiswa m3 = new Mahasiswa("201236", "Shannum", "021xx3");

        lm.tambah(m1, m2, m3);
        lm.tampil();

        int index = lm.binarySearch("201235");
        if (index != -1) {
            // Perbarui Mahasiswa dengan NIM yang ditemukan
            lm.update(index, new Mahasiswa("201235", "Akhleena Lena", "021xx2"));
        } else {
            System.out.println("Mahasiswa with NIM 201235 not found.");
        }

        System.out.println();
        lm.tampil();
    }
}