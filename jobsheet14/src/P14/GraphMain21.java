package P14;

import java.util.Scanner;

public class GraphMain21 {
    public static void main(String[] args) throws Exception {
        Graph21 gedung = new Graph21(6);
        gedung.addEdge(0, 1, 50); // A -> B
        gedung.addEdge(0, 2, 100); // A -> C
        gedung.addEdge(1, 3, 70); // B -> D
        gedung.addEdge(2, 3, 40); // C -> D
        gedung.addEdge(3, 4, 60); // D -> E
        gedung.addEdge(4, 5, 80); // E -> F

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Check Edge");
            System.out.println("0. Exit");
            System.out.print("Pilih menu (0-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan node asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan node tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan node asal untuk dihapus edge: ");
                    int asalRemove = scanner.nextInt();
                    System.out.print("Masukkan node tujuan untuk dihapus edge: ");
                    int tujuanRemove = scanner.nextInt();
                    gedung.removeEdge(asalRemove, tujuanRemove);
                    break;
                case 3:
                    System.out.print("Masukkan node untuk diketahui derajatnya: ");
                    int nodeDegree = scanner.nextInt();
                    gedung.degree(nodeDegree);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan node asal: ");
                    int asalCheck = scanner.nextInt();
                    System.out.print("Masukkan node tujuan: ");
                    int tujuanCheck = scanner.nextInt();
                    gedung.checkAdjacency(asalCheck, tujuanCheck);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
        }

        scanner.close();
    }
}