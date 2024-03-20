import java.util.Scanner;

public class mainPangkat21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih metode perhitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan jumlah elemen yang dihitung: ");
            int element = sc.nextInt();
            pangkat21[] png = new pangkat21[element];
            for (int i = 0; i < element; i++) {
                System.out.print("Masukkan nilai yang hendak dipangktkan: ");
                int nilai = sc.nextInt();
                System.out.print("Masukkan nilai pemangkat: ");
                int pangkat = sc.nextInt();
                png[i] = new pangkat21(nilai, pangkat);
            }
            System.out.println("Hasil PANGKAT - BRUTE FORCE");
            for (int i = 0; i < element; i++) {
                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan jumlah elemen yang dihitung: ");
            int element = sc.nextInt();
            pangkat21[] png = new pangkat21[element];
            for (int i = 0; i < element; i++) {
                System.out.print("Masukkan nilai yang hendak dipangktkan: ");
                int nilai = sc.nextInt();
                System.out.print("Masukkan nilai pemangkat: ");
                int pangkat = sc.nextInt();
                png[i] = new pangkat21(nilai, pangkat);
            }
            System.out.println("Hasil PANGKAT - DIVIDE AND CONQUER");
            for (int i = 0; i < element; i++) {
                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        sc.close();
    }
}
