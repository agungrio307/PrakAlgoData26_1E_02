package P15;
public class Mahasiswa_tugas02 {
    private String nim;
    private String nama;
    private String telepon;

    public Mahasiswa_tugas02() {}

    public Mahasiswa_tugas02(String nim, String nama, String telepon) {
        this.nim      = nim;
        this.nama     = nama;
        this.telepon  = telepon;
    }

    public String getNim()      { return nim; }
    public String getNama()     { return nama; }
    public String getTelepon()  { return telepon; }

    @Override
    public String toString() {
        return String.format("%-8s %-15s %-10s", nim, nama, telepon);
    }
}
