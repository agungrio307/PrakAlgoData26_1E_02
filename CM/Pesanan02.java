package CM;

public class Pesanan02 {
    // Menyimpan kode pesanan
    int kodePesanan;

    // Menyimpan nama menu yang dipesan
    String namaPesanan;

    // Menyimpan harga pesanan
    int harga;

    // Menyimpan nama pembeli yang memesan
    String namaPembeli;

    // Constructor untuk menginisialisasi data pesanan
    public Pesanan02(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        // Mengisi atribut kodePesanan dengan nilai dari parameter
        this.kodePesanan = kodePesanan;

        // Mengisi atribut namaPesanan dengan nilai dari parameter
        this.namaPesanan = namaPesanan;

        // Mengisi atribut harga dengan nilai dari parameter
        this.harga = harga;

        // Mengisi atribut namaPembeli dengan nilai dari parameter
        this.namaPembeli = namaPembeli;
    }

    // Method untuk menampilkan data pesanan
    public void tampil() {
        // Menampilkan kode pesanan, nama menu, dan harga
        System.out.println(kodePesanan + "\t\t" + namaPesanan + "\t\t" + harga);
    }
}
