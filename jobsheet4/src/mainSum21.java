import java.util.Scanner;

public class mainSum21{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int nPerusahaan = sc.nextInt();

        sum21[] perusahaan = new sum21[nPerusahaan];

        for (int i = 0; i < nPerusahaan; i++) {
            perusahaan[i] = new sum21();
            perusahaan[i].nomor = i +1;
            perusahaan[i].input(sc);
        }

        for (int i = 0; i < nPerusahaan; i++) {
            perusahaan[i].hitungKeuntungan();
            System.out.println(
                "Total keuntungan perusahaan " + 
                (i + 1) + " selama " +
                perusahaan[i].jumlahBulan + 
                " bulan adalah " + perusahaan[i].totalKeuntungan);
        }
    }
}

