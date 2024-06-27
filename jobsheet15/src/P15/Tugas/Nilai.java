package P15.Tugas;

public class Nilai {
    private Mahasiswa mahasiswa;
    private MataKuliah mataKuliah;
    private double nilai;

    public Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Mahasiswa: " + mahasiswa.getNama() + ", Mata Kuliah: " + mataKuliah.getNama() + ", Nilai: " + nilai;
    }
}