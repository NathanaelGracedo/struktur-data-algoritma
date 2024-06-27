package P15.Tugas;
import java.util.*;

public class Main {
    private static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    private static List<Nilai> daftarNilai = new ArrayList<>();
    private static Queue<String> queueHapusMahasiswa = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data Mahasiswa
        daftarMahasiswa.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        // Data Mata Kuliah
        daftarMataKuliah.add(new MataKuliah("0001", "Internet of Things", 3));
        daftarMataKuliah.add(new MataKuliah("0002", "Algoritma dan Struktur Data", 2));
        daftarMataKuliah.add(new MataKuliah("0003", "Algoritma dan Pemrograman", 2));
        daftarMataKuliah.add(new MataKuliah("0004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah("0005", "Praktikum Algoritma dan Pemrograman", 3));

        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    inputNilai(scanner);
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilaiMahasiswa(scanner);
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    System.out.println("Keluar program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    private static void inputNilai(Scanner scanner) {
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("**************************************************");
        System.out.println("NIM\tNama\tTelepon");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m);
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = scanner.next();
        Mahasiswa mahasiswa = cariMahasiswa(nim);

        if (mahasiswa == null) {
            System.out.println("Mahasiswa tidak ditemukan.");
            return;
        }

        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("**************************************************");
        System.out.println("Kode\tMata Kuliah\tSKS");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println(mk);
        }
        System.out.print("Pilih MK by kode: ");
        String kode = scanner.next();
        MataKuliah mataKuliah = cariMataKuliah(kode);

        if (mataKuliah == null) {
            System.out.println("Mata Kuliah tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan Nilai: ");
        double nilai = scanner.nextDouble();

        Nilai nilaiMahasiswa = new Nilai(mahasiswa, mataKuliah, (int) nilai);
        daftarNilai.add(nilaiMahasiswa);

        System.out.println("Nilai berhasil ditambahkan.");
    }

    private static Mahasiswa cariMahasiswa(String nim) {
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return null;
    }

    private static MataKuliah cariMataKuliah(String kode) {
        for (MataKuliah mk : daftarMataKuliah) {
            if (mk.getKode().equals(kode)) {
                return mk;
            }
        }
        return null;
    }

    private static void tampilNilai() {
        System.out.println("DAFTAR NILAI");
        System.out.println("**************************************************");
        for (Nilai n : daftarNilai) {
            System.out.println(n);
        }
    }

    private static void cariNilaiMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = scanner.next();
        Mahasiswa mahasiswa = cariMahasiswa(nim);

        if (mahasiswa != null) {
            for (Nilai n : daftarNilai) {
                if (n.getMahasiswa().equals(mahasiswa)) {
                    System.out.println(n);
                }
            }
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    private static void urutDataNilai() {
        Collections.sort(daftarNilai, new Comparator<Nilai>() {
            @Override
            public int compare(Nilai n1, Nilai n2) {
                return Double.compare(n1.getNilai(), n2.getNilai());
            }
        });

        System.out.println("Data nilai berhasil diurutkan.");
        tampilNilai();
    }
    private static void hapusMahasiswa(Scanner scanner) {
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("**************************************************");
        System.out.println("NIM\tNama\tTelepon");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m);
        }
        System.out.print("Masukkan NIM mahasiswa yang ingin dihapus: ");
        String nim = scanner.next();

        queueHapusMahasiswa.add(nim);
        System.out.println("Mahasiswa berhasil ditambahkan ke dalam antrian untuk dihapus.");

        while (!queueHapusMahasiswa.isEmpty()) {
            String nimHapus = queueHapusMahasiswa.poll();
            Mahasiswa mahasiswa = cariMahasiswa(nimHapus);

            if (mahasiswa != null) {
                daftarMahasiswa.remove(mahasiswa);
                System.out.println("Mahasiswa dengan NIM " + nimHapus + " berhasil dihapus.");
                daftarNilai.removeIf(nilai -> nilai.getMahasiswa().equals(mahasiswa));
            } else {
                System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
            }
}
    }
}