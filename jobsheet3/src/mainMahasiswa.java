//Tambahkan scanner, menampilkann mahasiswa dengan ipk tertinggi
import java.util.Scanner;

public class mainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa mhs[] = new Mahasiswa[3];
        

        for(int i = 0; i <  mhs.length; i++) {
            System.out.printf("Masukkan detail untuk Mahasiswa %d:\n", i + 1);
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: " );
            String nim = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = sc.nextLine().charAt(0);
            System.out.print("IPK: ");
            double IPK = sc.nextDouble();
            sc.nextLine();

            mhs[i] = new Mahasiswa(nim, nama, jenisKelamin, IPK);
        }   

        double rataRataIPK = rataRataIPK(mhs) ;
        Mahasiswa IPKtertinggi = mahasiswaIPKtertinggi(mhs);
        System.out.println("\nInformasi Mahasiswa:");
        for (Mahasiswa mahasiswa : mhs){
            Mahasiswa x = (Mahasiswa) mahasiswa;
            System.out.println("----- " + x.nama + " -----");
            System.out.println("NIM: " + x.nim);
            System.out.println("Jenis Kelamin: " + (x.jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
            System.out.println("IPK: " + String.format("%.2f", x.IPK));
        }

            System.out.println("\nRata-rata IPK: " + String.format("%.2f", rataRataIPK));
            System.out.println("\nMahasiswa dengan IPK tertinggi:");
            System.out.println("----- " + IPKtertinggi.nama + " -----");
            System.out.println("NIM: " + IPKtertinggi.nim);
            System.out.println("Gender: " + (IPKtertinggi.jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
            System.out.println("IPK: " + String.format("%.2f", IPKtertinggi.IPK));
        sc.close();
     }

     public static double rataRataIPK(Mahasiswa[] mahasiswa){
        double totalIPK = 0;
        for(Mahasiswa mhs : mahasiswa){
            totalIPK += mhs.IPK;
        }
        return totalIPK / mahasiswa.length;
     }

     public static Mahasiswa mahasiswaIPKtertinggi(Mahasiswa[] mhs){
        Mahasiswa IPKtertinggi = mhs[0];
        for(Mahasiswa mahasiswa : mhs ){
            if (mahasiswa.IPK > IPKtertinggi.IPK) {
                IPKtertinggi = mahasiswa;
            }
        }
        return IPKtertinggi;
     }
}
