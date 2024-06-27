package P14;
 
public class GraphMatriks21 {
    int vertex;
    int[][] matriks;
 
    public GraphMatriks21(int v) {
        vertex = v;
        matriks = new int[vertex][vertex];
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                matriks[i][j] = -1;
            }
        }
    }
    
 
    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }
 
    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }
 
    public void degree() {
        int totalIn, totalOut;
        for (int i = 0; i < vertex; i++) {
            totalIn = totalOut = 0;
            for (int j = 0; j < vertex; j++) {
                if (matriks[j][i] != -1) {
                    totalIn++;
                }
                if (matriks[i][j] != -1) {
                    totalOut++;
                }
            }
            System.out.println("Gedung " + (char) ('A' + i) + " memiliki indegree: " + totalIn + ", outdegree: "
                    + totalOut + ", degree: " + (totalIn + totalOut));
        }
    }
    
    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }
}
