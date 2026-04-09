package P7.CM;

// Class Buku untuk menyimpan data buku
public class Buku02 {
    String kode, judul;
    int tahun;

    // Constructor
    public Buku02(String kode, String judul, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }

    // Method untuk menampilkan data buku
    public void tampil() {
        System.out.println("Kode: " + kode + 
                           " | Judul: " + judul + 
                           " | Tahun: " + tahun);
    }
}
