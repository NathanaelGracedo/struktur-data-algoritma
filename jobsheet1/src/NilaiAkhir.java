import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan nilai tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();
        System.out.println("===============================");
        System.out.println("===============================");
        double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);
        if (nilaiAkhir == -1) {
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0 hingga 100.");
        } else { 
            System.out.println("Nilai akhir mahasiswa: " + nilaiAkhir);
            cetakNilaiHuruf(nilaiAkhir);
            System.out.println("===============================");
            System.out.println("===============================");
            if (nilaiAkhir >= 60) {
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("Anda Tidak Lulus");
            }
        }
        input.close();
    }

    public static double hitungNilaiAkhir(double tugas, double kuis, double uts, double uas) {
        if (!isNilaiValid(tugas) || !isNilaiValid(kuis) || !isNilaiValid(uts) || !isNilaiValid(uas)) {
            return -1; // Return -1 jika nilai tidak valid
        }
        return (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
    }

    public static boolean isNilaiValid(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    public static void cetakNilaiHuruf(double nilaiAkhir) {
        String nilaiHuruf;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}
