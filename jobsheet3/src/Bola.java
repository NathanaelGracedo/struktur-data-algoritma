public class Bola {
    public int jariJari;

    Bola(int r) {
        jariJari = r; 
    }

    double hitungLuasPermukaanBola(){
        return 4 * Math.PI * Math.pow(jariJari, 3);
    }

    double hitungVolumeBola(){
    return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}
