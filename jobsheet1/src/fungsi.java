import java.util.Scanner;

public class fungsi {

    private static final char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N','T'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("1. Cari Nama Kota dari Kode Plat");
            System.out.println("2. Hitung Kecepatan");
            System.out.println("3. Hitung Jarak");
            System.out.println("4. Hitung Waktu");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cariNamaKota(scanner);
                    break;
                case 2:
                    hitungKecepatan(scanner);
                    break;
                case 3:
                    hitungJarak(scanner);
                    break;
                case 4:
                    hitungWaktu(scanner);
                    break;
            }
        } while (pilihan != 0);
    }

    private static void cariNamaKota(Scanner scanner) {
        System.out.print("Masukkan kode plat mobil: ");
        String kodePlat = scanner.next().toUpperCase();

        int indexKode = findIndexKode(kodePlat);
        if (indexKode == -1) {
            System.out.println("Kode plat tidak ditemukan!");
        } else {
            String kota;
            if (kodePlat.charAt(0) == 'A') {
                kota = "BANTEN";
            } else if (kodePlat.charAt(0) == 'B') {
                kota = "JAKARTA";
            } else if (kodePlat.charAt(0) == 'D') {
                kota = "BANDUNG";
            } else if (kodePlat.charAt(0) == 'E') {
                kota = "CIREBON";
            } else if (kodePlat.charAt(0) == 'F') {
                kota = "BOGOR";
            } else if (kodePlat.charAt(0) == 'G') {
                kota = "PEKALONGAN";
            } else if (kodePlat.charAt(0) == 'H') {
                kota = "SEMARANG";
            } else if (kodePlat.charAt(0) == 'L') {
                kota = "SURABAYA";
            } else if (kodePlat.charAt(0) == 'N') {
                kota = "MALANG";
            } else if (kodePlat.charAt(0) == 'T'){   
                kota = "TEGAL";
            } else {
                kota = "Tidak Diketahui";
            }
            System.out.println("Kota: " + kota);
        }
    }

    private static int findIndexKode(String kodePlat) {
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodePlat.charAt(0)) {
                return i;
            }
        }
        return -1;
    }

    private static void hitungKecepatan(Scanner scanner) {
        System.out.print("Masukkan jarak (m): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan: " + kecepatan + " m/s");
    }

    private static void hitungJarak(Scanner scanner) {
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak: " + jarak + " m");
    }

    private static void hitungWaktu(Scanner scanner) {
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan jarak (m): ");
        double jarak = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu: " + waktu + " sekon");
    }
}