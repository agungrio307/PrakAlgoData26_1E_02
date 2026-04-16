package P7.CM;

// Class Peminjaman untuk menyimpan transaksi peminjaman
public class Peminjaman02 {
    Mahasiswa02 mhs;   // relasi ke mahasiswa
    Buku02 buku;       // relasi ke buku
    int lamaPinjam;
    // Jawaban sesi 2 (A)
    boolean isMember; // status membership mahasiswa: true = member, false = non-member
    int terlambat;
    int denda;

    // Constructor
    // Jawaban sesi 2 (A) 
    // ditambahkan parameter isMember
    public Peminjaman02(Mahasiswa02 mhs, Buku02 buku, int lamaPinjam, boolean isMember) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        // Jawaban sesi 2 (A)
        this.isMember = isMember; // simpan status membership mahasiswa
        hitungDenda(); // langsung hitung saat objek dibuat
    }

    // Method menghitung keterlambatan dan denda
    void hitungDenda() {
        // Jawaban sesi 2 (A)
        int batas;
        if (isMember) {
            batas = 7;
        } else {
            batas = 5;
        }
        int dendaPerHari = 2000; // denda per hari keterlambatan

        // Jawaban sesi 2 (A)
        // Cek apakah lama pinjam melebihi batas sesuai status membership
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
        // Jawaban sesi 2 (A)
        String statusMember;
        if (isMember) {
            statusMember = "Ya";
        } else {
            statusMember = "Tidak";
        }

        System.out.println(mhs.nama + " | " + buku.judul +
                " | Member: " + statusMember +
                " | Lama: " + lamaPinjam +
                " | Terlambat: " + terlambat +
                " | Denda: " + denda);
    }
}
