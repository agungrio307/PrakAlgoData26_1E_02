package P14;

// MODIFIKASI:
// Class Mahasiswa02 diubah menjadi Produk02
// Menyimpan data produk berupa kodeProduk, namaProduk, kategori, dan harga
public class Produk02 {
    String kodeProduk;
    String namaProduk;
    String kategori;
    double harga; 

    public Produk02() {
    }

    // Constructor untuk menginisialisasi data produk
    public Produk02(String kodeProduk, String namaProduk, String kategori, double harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.kategori = kategori;
        this.harga = harga;
    }

    // Menampilkan informasi produk
    public void tampilInformasi() {
        System.out.println("Kode Produk: " + this.kodeProduk + " " +
                "Nama Produk: " + this.namaProduk + " " +
                "Kategori: " + this.kategori + " " +
                "Harga: " + this.harga);
    }
}
