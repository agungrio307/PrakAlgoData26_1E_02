package P15;

public class Nilai02 {
    private Mahasiswa_tugas02 mahasiswa;
    private MataKuliah02 mataKuliah;
    private double nilai;

    public Nilai02() {}

    public Nilai02(Mahasiswa_tugas02 mahasiswa, MataKuliah02 mataKuliah, double nilai) {
        this.mahasiswa  = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai      = nilai;
    }

    public Mahasiswa_tugas02 getMahasiswa()    { return mahasiswa; }
    public MataKuliah02 getMataKuliah()  { return mataKuliah; }
    public double getNilai()           { return nilai; }

    public void setNilai(double nilai) { this.nilai = nilai; }

    @Override
    public String toString() {
        return String.format("%-8s %-15s %-40s %-5d %.2f",
                mahasiswa.getNim(),
                mahasiswa.getNama(),
                mataKuliah.getNamaMK(),
                mataKuliah.getSks(),
                nilai);
    }
}
