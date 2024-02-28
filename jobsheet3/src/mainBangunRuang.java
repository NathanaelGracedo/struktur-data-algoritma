import java.util.Scanner;

public class mainBangunRuang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bangun ruang: ");
        int jumlah = sc.nextInt();

        Kerucut[] kerucut = new Kerucut[jumlah];
        LimasSegi4SmSisi[] limas = new LimasSegi4SmSisi[jumlah];
        Bola[] bola = new Bola[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Kerucut ke-" + (i + 1));
            System.out.print("Jari-jari: ");
            int rKerucut = sc.nextInt();
            System.out.print("Sisi miring: ");
            int smKerucut = sc.nextInt();
            kerucut[i] = new Kerucut(rKerucut, smKerucut);

            System.out.println("Limas Segi Empat Sisi Sama Sisi ke-" + (i + 1));
            System.out.print("Sisi alas: ");
            int sisiAlasLimas = sc.nextInt();
            System.out.print("Tinggi: ");
            int tinggiLimas = sc.nextInt();
            limas[i] = new LimasSegi4SmSisi(sisiAlasLimas, tinggiLimas);

            System.out.println("Bola ke-" + (i + 1));
            System.out.print("Jari-jari: ");
            int jariBola = sc.nextInt();
            bola[i] = new Bola(jariBola);
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nBangun Ruang ke-" + (i + 1));
            System.out.println("------          Kerucut             ------");
            System.out.println("Volume: " + kerucut[i].hitungVolume());
            System.out.println("Luas Permukaan: " + kerucut[i].luasPermukaanKrc());
            System.out.println("------  Limas Segi Empat Sisi Sama Sisi ------");
            System.out.println("Volume: " + limas[i].hitungVolume());
            System.out.println("Luas Permukaan: " + limas[i].hitunglpLim());
            System.out.println("------          Bola            ------");
            System.out.println("Volume: " + bola[i].hitungVolumeBola());
            System.out.println("Luas Permukaan: " + bola[i].hitungLuasPermukaanBola());
        }
        sc.close();
    }
}