package P15.Tugas;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String telepon;

    public Mahasiswa(String nim, String nama, String telepon) {
        this.nim = nim;
        this.nama = nama;
        this.telepon = telepon;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    @Override
    public String toString() {
        return nim + "\t" + nama + "\t" + telepon;
    }
}