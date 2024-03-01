public class fungsi {

    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] hrgBunga = {75000, 50000, 60000, 10000};

        System.out.println("Penghasilan dari tiap cabang jika seluruh bunga terjual:");
        tampilPendapatan(stokBunga, hrgBunga);

        System.out.println("\nStok tiap bunga di Royal Garden Cabang 4:");
        tampilStok(stokBunga, 3);

        System.out.println("\nPenyesuaian stok tiap bunga di Royal Garden Cabang 4:");
        kurangiStok(stokBunga, 3, -1, -2, 0, -5);
        tampilStok(stokBunga, 3);
    }

    public static void tampilPendapatan(int[][] stokBunga, int[] hrgBunga) {
        for (int i = 0; i < stokBunga.length; i++) {
            int penghasilan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                penghasilan += stokBunga[i][j] * hrgBunga[j];
            }
            System.out.printf("Cabbang %d: Rp. %d\n", i + 1, penghasilan);
        }
    }

    public static void tampilStok(int[][] stokBunga, int cabang) {
        for (int i = 0; i < stokBunga[cabang].length; i++) {
            System.out.printf("Bunga %d: %d\n", i + 1, stokBunga[cabang][i]);
        }
    }

    public static void kurangiStok(int[][] stokBunga, int cabang, int... pengurangan) {
        for (int i = 0; i < pengurangan.length; i++) {
            stokBunga[cabang][i] += pengurangan[i];
        }
    }
}