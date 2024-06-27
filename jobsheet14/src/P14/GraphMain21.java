package P14;

import java.util.Scanner;
public class GraphMain21 {
    public static void main(String[] args) {
        Graph21 graph = new Graph21(6);
        Scanner sc = new Scanner(System.in);
        try {
            graph.addEdge(0, 1, 50);
            graph.addEdge(0, 2, 100);
            graph.addEdge(1, 3, 70);
            graph.addEdge(2, 3, 40);
            graph.addEdge(3, 4, 60);
            graph.addEdge(4, 5, 80);
            graph.degree(0);
            graph.printGraph();
            graph.degree(1);
            graph.removeEdge(1, 3);
            graph.printGraph();
            System.out.print("\nMasukkan gedun asal: ");
            int asal = sc.nextInt();
            System.out.print("Masukkan gedun tujuan: ");
            int tujuan = sc.nextInt();
            graph.checkAdjacency(asal, tujuan);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
