package KonversiInfixKePostFix;

import java.util.Scanner;

public class PostFixMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";       

        int total = Q.length();
        Postfix21 post = new Postfix21(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    
        sc.close();
    }
}
