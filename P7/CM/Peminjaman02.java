package P7.CM;

// Class Peminjaman untuk menyimpan transaksi peminjaman
public class Peminjaman02 {
    Mahasiswa02 mhs;   // relasi ke mahasiswa
    Buku02 buku;       // relasi ke buku
    int lamaPinjam;
    int terlambat;
    int denda;

    // Constructor
    public Peminjaman02(Mahasiswa02 mhs, Buku02 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda(); // langsung hitung saat objek dibuat
    }

    // Method menghitung keterlambatan dan denda
    void hitungDenda() {
        int batas = 5;            // maksimal pinjam
        int dendaPerHari = 2000;  // denda per hari

        if (lamaPinjam > batas) {
            terlambat = lamaPinjam - batas;
            denda = terlambat * dendaPerHari;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    // Method menampilkan data peminjaman
    public void tampil() {
        System.out.println(mhs.nama + " | " + buku.judul +
                " | Lama: " + lamaPinjam +
                " | Terlambat: " + terlambat +
                " | Denda: " + denda);
    }
}
