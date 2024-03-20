import java.util.Scanner;

public class BruteForceDivideConquer21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Masukkan jumlah elemen");
        int ijml = sc.nextInt();

        Faktorial21[] fk = new Faktorial21[ijml];
        for (int i = 0; i < ijml; i++) { 
            fk[i] = new Faktorial21();
            System.out.println("Masukkan Nilai data ke - " + (i + 1) + ":");
            int nilai = sc.nextInt();
            fk[i].nilai = nilai; 
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < ijml; i++) { 
            System.out.println("Hasil Perhitungan Faktorial Menggunakan Brute Force Adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < ijml; i++) { 
            System.out.println("Hasil Perhitungan Faktorial Menggunakan Divide and Conquer Adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }
        sc.close();
    }
}

