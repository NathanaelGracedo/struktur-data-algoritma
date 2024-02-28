import java.util.Scanner;

public class array {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        String[][] matkulDanSKS = {
            {"Pancasila", "2"}, 
            {"Konsep Teknologi Informasi", "2"},
            {"Critical Thinking dan Problem Solving", "2"},
            {"Matematika Dasar", "3"},
            {"Bahasa Inggris", "2"},
            {"Dasar Pemrograman", "2"},
            {"Praktikum Dasar Pemrograman", "3"},
            {"Keselamatan dan Kesehatan Kerja", "2"}
        };
        double[] nilai = new double[matkulDanSKS.length];
        String[][] konversi = new String[matkulDanSKS.length][4]; 

        String tempNilaiHuruf;
        double tempBobotNilai, IP = 0;


        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");


        for (int index = 0; index < matkulDanSKS.length; index++) {
            System.out.print("masukkan nilai Angka untuk MK  "+matkulDanSKS[index][0]+":");
            nilai[index] = scanner.nextDouble();

            while ( nilai[index] < 0 || 100 < nilai[index]){
                System.out.printf("\n[nilai tidak valid]\nmasukkan nilai Angka untuk MK %s: ", matkulDanSKS[index][0]);
                nilai[index] = scanner.nextDouble();
            
                scanner.close();
            };
        }

        for (int row = 0; row < konversi.length; row++) {

            tempNilaiHuruf = (nilai[row] > 80 && nilai[row] <= 100) ? "A" 
            : (nilai[row] > 73) ? "B+" 
            : (nilai[row] > 65) ? "B" 
            : (nilai[row] > 60) ? "C+"
            : (nilai[row] > 50) ? "C"
            : (nilai[row] > 39) ? "D"
            : "E";
   
            tempBobotNilai = (nilai[row] > 80 && nilai[row] <= 100) ? 4 
            : (nilai[row] > 73) ? 3.5 
            : (nilai[row] > 65) ? 3
            : (nilai[row] > 60) ? 2.5
            : (nilai[row] > 50) ? 2
            : (nilai[row] > 39) ? 1
            : 0;

            konversi[row][0] = matkulDanSKS[row][0];
        
            konversi[row][1] = ""+nilai[row];
   
            konversi[row][2] = tempNilaiHuruf;
           
            konversi[row][3] = ""+tempBobotNilai;

          
            IP += (tempBobotNilai * Double.parseDouble(matkulDanSKS[row][1])) / 18;
        }

        System.out.println("\n\nHASIL KONVERSI NILAI\n");

        System.out.println("MK\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        System.out.printf("%s\t\t\t\t  %s\t\t     %s\t\t    %s\n", konversi[0][0], konversi[0][1], konversi[0][2], konversi[0][3]);
        System.out.printf("%s\t\t  %s\t\t     %s\t\t    %s\n", konversi[1][0], konversi[1][1], konversi[1][2], konversi[1][3]);
        System.out.printf("%s\t  %s\t\t     %s\t\t    %s\n", konversi[2][0], konversi[2][1], konversi[2][2], konversi[2][3]);
        System.out.printf("%s\t\t\t  %s\t\t     %s\t\t    %s\n", konversi[3][0], konversi[3][1], konversi[3][2], konversi[3][3]);
        System.out.printf("%s\t\t\t\t  %s\t\t     %s\t\t    %s\n", konversi[4][0], konversi[4][1], konversi[4][2], konversi[4][3]);
        System.out.printf("%s\t\t\t  %s\t\t     %s\t\t    %s\n", konversi[5][0], konversi[5][1], konversi[5][2], konversi[5][3]);
        System.out.printf("%s\t\t  %s\t\t     %s\t\t    %s\n", konversi[6][0], konversi[6][1], konversi[6][2], konversi[6][3]);
        System.out.printf("%s\t\t  %s\t\t     %s\t\t    %s\n", konversi[7][0], konversi[7][1], konversi[7][2], konversi[7][3]);

        System.out.printf("\nIP : %.2f\n",IP);
    }
}
