package P15.praktikum3;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

public class Mahasiswa {
    String nim,nama,notelp;

    Mahasiswa(){

    }
    Mahasiswa(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
    public String getNim() {
        return nim;
    }
}