import java.util.Scanner;
public class nimPerulangan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nim, hasil = "";
        int n;

        do{
            System.out.print("Masukkan NIM : ");
            nim = scanner.nextLine();
    
            System.out.print(
                (nim.isEmpty() || nim == null || nim.length() <= 2) 
                ? "\nMasukkan nim dengan benar!\n\n" : ""
            );
        } while (nim.isEmpty() || nim == null || nim.length() < 2);

        n =  Integer.parseInt(nim.substring(nim.length() - 2));
        
        n += (n < 10) ? 10 : 0;

        for(int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) continue;
            hasil += (i % 2 == 0) ? i+" " : "* ";
        }
        System.out.printf("\nn : %d\n%s", n, hasil);
        scanner.close();
    }

}