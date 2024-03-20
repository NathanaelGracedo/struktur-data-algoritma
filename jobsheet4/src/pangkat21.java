public class pangkat21 {

    public int nilai;
    public int pangkat;

    public pangkat21(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int nilai, int pangkat ) {
        int hasil = 0;
        for (int i = 0; i < pangkat; i++) {
            hasil += nilai;
        }
        return hasil;
    }

    int pangkatDC(int nilai, int pangkat) {
        if (pangkat == 1) {
            return nilai;
        } else {
            if (pangkat % 2 == 0) {
                return pangkatDC(nilai, pangkat/2) * pangkatDC(nilai, pangkat/2);
            } else {
                return pangkatDC(nilai, pangkat/2) * pangkatDC(nilai, pangkat/2) * nilai;
            }
        }
    }
}
