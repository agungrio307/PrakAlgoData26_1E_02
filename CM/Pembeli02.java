package CM;

public class Pembeli02 {
    // Menyimpan nomor antrean pembeli
    int noAntrian;

    // Menyimpan nama pembeli
    String namaPembeli;

    // Menyimpan nomor HP pembeli
    String noHp;

    // Constructor untuk menginisialisasi data pembeli
    public Pembeli02(int noAntrian, String namaPembeli, String noHp) {
        // Mengisi atribut noAntrian dengan nilai dari parameter
        this.noAntrian = noAntrian;

        // Mengisi atribut namaPembeli dengan nilai dari parameter
        this.namaPembeli = namaPembeli;

        // Mengisi atribut noHp dengan nilai dari parameter
        this.noHp = noHp;
    }

    // Method untuk menampilkan data pembeli
    public void tampil() {
        // Menampilkan nomor antrean, nama pembeli, dan nomor HP
        System.out.println(noAntrian + "\t\t" + namaPembeli + "\t\t" + noHp + "\t\t");
    }
}