import java.util.Scanner;

// class Persegi{
//     public int sisi;
// }

class PersegiPanjang {
    public int panjang;
    public int lebar;    
}

public class ArrayObject {
    public static void main(String[] args) {
        // Persegi[] pgArray = new Persegi[100];
        // pgArray[5].sisi = 20;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int x = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[x];
        
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();          
        }

        for(int i = 0; i < ppArray.length; i++){
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }

    sc.close();

    }
}

   